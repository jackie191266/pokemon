package com.poke.poke;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController {

	@GetMapping("/pokemon")
	public PokemonModel pokemon() {
		return new PokemonModel();
	}
	
	@GetMapping("/pokemon/{id}")
	public Pokemon pokemonById(@PathVariable String id) {
		PokemonModel pModel = new PokemonModel();
		
		if (Integer.parseInt(id) > 0 && Integer.parseInt(id) <= pModel.getCount()) {
			return new PokemonModel().getAllPokemons().get(Integer.parseInt(id) - 1);
		} else {
			if (Integer.parseInt(id) > pModel.getCount()) {
				return new Pokemon(0, "Error, you cannot enter an id greater than " + String.valueOf(pModel.getCount()));
			} else {
				return new Pokemon(0, "Error, you cannot enter an id less than 1");
			}
		}
	}
}