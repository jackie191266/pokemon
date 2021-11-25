package com.poke.poke;

import java.util.ArrayList;

public class PokemonModel {

	int count;
	private ArrayList<Pokemon> allPokemons = new ArrayList<Pokemon>();

	public PokemonModel() {
		allPokemons.add(new Pokemon(1, "Bulbasaur"));
		allPokemons.add(new Pokemon(2, "Ivysaur"));
		count = allPokemons.size();
	}

	public ArrayList<Pokemon> getAllPokemons() {
		return allPokemons;
	}

	public void setAllPokemons(ArrayList<Pokemon> allPokemons) {
		this.allPokemons = allPokemons;
	}

	public int getCount() {
		return count;
	}
}
