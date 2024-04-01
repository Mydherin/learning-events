package local.learning.pokemon.infrastructure.out;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "pokemonClient", url = "https://pokeapi.co/api/v2")
public interface PokemonClient {

    @GetMapping("/pokemon/{id}")
    @Cacheable("pokemonCollection")
    PokemonDTO getPokemonById(@PathVariable("id") Integer id);
}