package local.learning.pokemon.infrastructure.in;

import feign.FeignException;
import local.learning.pokemon.application.CreateTeamUseCase;
import org.openapitools.api.PokemonApi;
import org.openapitools.model.CreateTeam201Response;
import org.openapitools.model.CreateTeamRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController implements PokemonApi {
    private final CreateTeamUseCase createTeamUseCase;

    public PokemonController(CreateTeamUseCase createTeamUseCase) {
        this.createTeamUseCase = createTeamUseCase;
    }

    @Override
    public ResponseEntity<CreateTeam201Response> createTeam(final CreateTeamRequest createTeamRequest) {
        this.createTeamUseCase.handle(createTeamRequest);
        return ResponseEntity.ok(null);
    }
    @ExceptionHandler(FeignException.class)
    public ResponseEntity<String> handleFeignClientException(final FeignException ex) {
        if (ex.status() == 404) {
            return new ResponseEntity<>(ex.toString(), HttpStatus.NOT_FOUND);
        }
        throw ex;
    }
}
