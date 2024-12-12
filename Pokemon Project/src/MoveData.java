import java.util.ArrayList;
public class MoveData
	{
		static ArrayList<Move> pikachu = new ArrayList();
		static ArrayList<Move> raichu = new ArrayList();
		static ArrayList<Move> squirtle = new ArrayList();
		static ArrayList<Move> wartortle = new ArrayList();
		static ArrayList<Move> blastoise = new ArrayList();
		static ArrayList<Move> charmander = new ArrayList();
		static ArrayList<Move> charmeleon = new ArrayList();
		static ArrayList<Move> charizard = new ArrayList();
		static ArrayList<Move> bulbasaur = new ArrayList();
		static ArrayList<Move> ivysaur = new ArrayList();
		static ArrayList<Move> venusaur = new ArrayList();
		static ArrayList<Move> porygon = new ArrayList();
		
		public static void pikachu()
			{
				
				pikachu.add(new Move("Thunderbolt", "Electric", 90, 100, 15));
				pikachu.add(new Move("Tail Whip", "Normal", 0, 100, 30));
				pikachu.add(new Move("Quick Attack", "Normal", 40, 100, 30));
				pikachu.add(new Move("Thunder Wave", "Electric", 0, 90, 20));
			}

		public static void raichu()
		{
			raichu.add(new Move("Discharge", "Electric", 80, 100, 15));
			raichu.add(new Move("Iron Tail", "Steel", 100, 75, 15));
			raichu.add(new Move("Thunder", "Electric", 110, 70, 10));
			raichu.add(new Move("Spark", "Electric", 65, 100, 20));
		}
		public static void squirtle()
		{
			squirtle.add(new Move("Water Gun", "Water", 40, 100, 25));
			squirtle.add(new Move("Rapid Spin", "Normal", 50, 100, 40));
			squirtle.add(new Move("Bite", "Dark", 60, 100, 25));
			squirtle.add(new Move("tackle", "Water", 40, 100, 35));
		}
		public static void wartortle()
		{
			wartortle.add(new Move("Water Pulse", "Water", 60, 100, 20));
			wartortle.add(new Move("Hydro Pump", "Water", 110, 80, 5));
			wartortle.add(new Move("Aqua Tail", "Water", 90, 90, 10));
			wartortle.add(new Move("Protect", "Water", 0, 100, 10));
		}
		public static void blastoise()
		{
			blastoise.add(new Move("Wave Crash", "Water", 120, 100, 10));
			blastoise.add(new Move("Hydro Pump", "Water", 110, 80, 5));
			blastoise.add(new Move("Bite", "Dark", 60, 100, 25));
			blastoise.add(new Move("Protect", "Water", 0, 100, 10));
		}
		
		public static void charmander()
		{
			charmander.add(new Move("Growl", "Normal", 0, 100, 40));
			charmander.add(new Move("Scratch", "Normal", 40, 100, 35));
			charmander.add(new Move("Ember", "Fire", 40, 100, 25));
			charmander.add(new Move("Smokescreen", "Normal", 0, 100, 20));
		}
		public static void charmeleon()
		{
			charmeleon.add(new Move("Dragon Breath", "Dragon", 60, 100, 20));
			charmeleon.add(new Move("Fire Fang", "Fire", 65, 95, 15));
			charmeleon.add(new Move("Slash", "Normal", 70, 100, 20));
			charmeleon.add(new Move("Flamethrower", "Fire", 90, 100, 15));
		
		}
		public static void charizard()
		{
			charizard.add(new Move("Scary Face", "Normal", 0, 100, 10));
			charizard.add(new Move("Fire Spin", "Fire", 0, 85, 15));
			charizard.add(new Move("Inferno", "Fire", 100, 50, 5));
			charizard.add(new Move("Flamethrower", "Fire", 120, 100, 15));
		
		}
		public static void bulbasaur()
		{
			bulbasaur.add(new Move("Petal Dance", "Grass", 120, 100, 10));
			bulbasaur.add(new Move("Tackle", "Normal", 40, 100, 35));
			bulbasaur.add(new Move("Vine Whip", "Grass", 45, 100, 25));
			bulbasaur.add(new Move("Razor Leaf", "Grass", 50, 95, 25));
		
		}
		
		public static void ivysaur()
		{
			ivysaur.add(new Move("Seed Bomb", "Grass", 80, 100, 15));
			ivysaur.add(new Move("Take Down", "Normal", 90, 85, 20));
			ivysaur.add(new Move("Petal Dance", "Grass", 120, 100, 10));
			ivysaur.add(new Move("Take Down", "Normal", 90, 85, 20));
		}
		public static void venusaur()
		{
			venusaur.add(new Move("Solar Beam", "Grass", 120, 100, 10));
			venusaur.add(new Move("Power Whip", "Grass", 120, 85, 10));
			venusaur.add(new Move("Double Edge", "Grass", 80, 100, 15));
			venusaur.add(new Move("Petal Blizzard", "Grass", 90, 100, 15));
		}
		public static void porygon()
		{
			porygon.add(new Move("Zap Cannon", "Electric", 120, 50, 5 ));
			porygon.add(new Move("Double Edge", "Grass", 80, 100, 15));
			porygon.add(new Move("Recover", "Recover", 0, 100, 5 ));
			porygon.add(new Move("Discharge", "Electric", 80, 100, 15 ));
		}
	}//******
