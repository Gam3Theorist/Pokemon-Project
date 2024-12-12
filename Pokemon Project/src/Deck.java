import java.util.ArrayList;
public class Deck
	{
static ArrayList<Pokemon> pokemon = new ArrayList();
		
		public static void PokemonList()
		{
			pokemon.add(new Pokemon("Pikachu", "Electric", 55,40,35));
			pokemon.add(new Pokemon("Raichu", "Electric", 90,55,60));
			pokemon.add(new Pokemon("Squirtle", "Water", 48,65,44));
			pokemon.add(new Pokemon("Wartortle", "Water", 63,80,59));
			pokemon.add(new Pokemon("Blastoise", "Water", 83,100,79));
			pokemon.add(new Pokemon("Charmander", "Fire", 52,43,39));
			pokemon.add(new Pokemon("Charmeleon", "Fire", 64,58,58));
			pokemon.add(new Pokemon("Charizard", "Fire ", 88,78,78)); //also flying type
			pokemon.add(new Pokemon("Bulbasaur", "Grass", 49,49,45));
			pokemon.add(new Pokemon("Ivysaur", "Grass", 62,63,60)); //also poison type
			pokemon.add(new Pokemon("Venusaur", "Grass", 82,83,80));//also poison type
			pokemon.add(new Pokemon("Porygon", "Normal", 60,70,65));
		}

	}
