package local.learning.pokemon.infrastructure.in;

import org.openapitools.api.PokemonApi;
import org.openapitools.model.CreateTeam201Response;
import org.openapitools.model.CreateTeamRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController implements PokemonApi {

    @Override
    public ResponseEntity<CreateTeam201Response> createTeam(CreateTeamRequest createTeamRequest) {
        return ResponseEntity.ok(null);
    }
}
