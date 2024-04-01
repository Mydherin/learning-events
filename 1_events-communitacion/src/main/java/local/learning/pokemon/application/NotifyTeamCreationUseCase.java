package local.learning.pokemon.application;

import local.learning.pokemon.infrastructure.RabbitMqConfiguration;
import local.learning.pokemon.infrastructure.out.TeamCreatedEvent;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class NotifyTeamCreationUseCase {

    @RabbitListener(queues = RabbitMqConfiguration.QUEUE_NAME)
    public void handle(final TeamCreatedEvent teamCreatedEvent) {
        System.out.println("Created");
    }
}
