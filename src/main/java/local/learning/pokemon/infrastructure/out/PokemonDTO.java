package local.learning.pokemon.infrastructure.out;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PokemonDTO {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("name")
    private String name;
}
