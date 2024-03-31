package local.learning.pokemon.application;

import local.learning.pokemon.infrastructure.RabbitMqConfiguration;
import local.learning.pokemon.infrastructure.out.*;
import lombok.RequiredArgsConstructor;
import org.openapitools.model.CreateTeamRequest;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateTeamUseCase {

    private final PokemonClient pokemonClient;
    private final JpaTeamRepository jpaTeamRepository;
    private final RabbitTemplate rabbitTemplate;

    public void handle(final CreateTeamRequest createTeamRequest) {
        final var pokemonCollection = createTeamRequest.getTeamMembers().stream()
                .map(pokemonId -> {
                    long beginTime = System.currentTimeMillis();
                    final var pokemon = this.pokemonClient.getPokemonById(Integer.valueOf(pokemonId));
                    long endTime = System.currentTimeMillis();
                    System.out.printf("Pokemon: %s, time: %s%n", pokemonId, endTime - beginTime);
                    return pokemon;
                })
                .toList();

        final var memberDTOCollection = pokemonCollection.stream()
                .map(pokemon -> new MemberDTO(null, pokemon.getId(), pokemon.getName(), null))
                .toList();

        final var team = this.jpaTeamRepository.save(new TeamDTO(null, memberDTOCollection));

        this.rabbitTemplate.convertAndSend(RabbitMqConfiguration.EXCHANGE_NAME, RabbitMqConfiguration.ROUTING_KEY, new TeamCreatedEvent(team.getId().toString()));
    }
}
