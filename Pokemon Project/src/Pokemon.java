
public class Pokemon
	{
private String Name;
private String Type;
private int Attack;
private int Defense;
private int Health;
	
public Pokemon(String n, String t, int a, int d, int h)
{
	Name=n;
	Type=t;
	Attack=a;
	Defense=d;
	Health= h;
}

public String getName()
	{
		return Name;
	}

public void setName(String name)
	{
		Name = name;
	}

public String getType()
	{
		return Type;
	}

public void setType(String type)
	{
		Type = type;
	}

public int getAttack()
	{
		return Attack;
	}

public void setAttack(int attack)
	{
		Attack = attack;
	}

public int getDefense()
	{
		return Defense;
	}

public void setDefense(int defense)
	{
		Defense = defense;
	}

public int getHealth()
	{
		return Health;
	}

public void setHealth(int health)
	{
		Health = health;
	}




}