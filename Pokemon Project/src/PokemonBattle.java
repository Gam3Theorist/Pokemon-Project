import java.util.ArrayList;

public class PokemonBattle
	{
	static int random=0;
	static int team1In=0;
	static int team2In=0;
static ArrayList<Pokemon> team1 = new ArrayList();
static ArrayList<Pokemon> team2 = new ArrayList();

		public static void main(String[] args)
			{
				Deck.PokemonList();   //******
				
				choosePokemon();

			}

		public static void choosePokemon()
		{
			System.out.println("Hello! Welcome to the world of Pokemon! ");
			System.out.println("Here is your randomised team you have to defeat your opponent!");
			
			for(int i=0; i<6; i++)
				{
				  random=(int) (Math.random()*(Deck.pokemon.size()));
					team1.add(new Pokemon("Filler","Filler", 0, 0,0));
					
					team1.get(i).setName(Deck.pokemon.get(random).getName());
					team1.get(i).setType(Deck.pokemon.get(random).getType());
					team1.get(i).setAttack(Deck.pokemon.get(random).getAttack());
					team1.get(i).setHealth(Deck.pokemon.get(random).getHealth());
					team1.get(i).setDefense(Deck.pokemon.get(random).getDefense());
					
					Deck.pokemon.remove(random);
					
					System.out.println((i+1)+". "+team1.get(i).getName());
				}
			
			for(int i=0; i<6; i++)
				{
				  random=(int) (Math.random()*(Deck.pokemon.size()));
					team2.add(new Pokemon("Filler","Filler", 0, 0,0));
					
					team2.get(i).setName(Deck.pokemon.get(random).getName());
					team2.get(i).setType(Deck.pokemon.get(random).getType());
					team2.get(i).setAttack(Deck.pokemon.get(random).getAttack());
					team2.get(i).setHealth(Deck.pokemon.get(random).getHealth());
					team2.get(i).setDefense(Deck.pokemon.get(random).getDefense());
					
					Deck.pokemon.remove(random);
					
				}
		}
		
		public static void battle()
		{
			
		}

	
	
	
	
	
	
	
	
	
	
	} //********
