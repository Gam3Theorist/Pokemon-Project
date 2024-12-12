
public class Move
	{
		
			private String name;
			private String type;
			private int attack;
			private int accuracy;
			private int pp;
			public Move(String n, String t, int at, int ac, int pp)
			{
				name=n;
				type=t;
				attack=at;
				accuracy=ac;
				pp=pp;
			}
			public String getName()
				{
					return name;
				}
			public void setName(String name)
				{
					this.name = name;
				}
			public String getType()
				{
					return type;
				}
			public void setType(String type)
				{
					this.type = type;
				}
			public int getAttack()
				{
					return attack;
				}
			public void setAttack(int attack)
				{
					this.attack = attack;
				}
			public int getAccuracy()
				{
					return accuracy;
				}
			public void setAccuracy(int accuracy)
				{
					this.accuracy = accuracy;
				}
			public int getPp()
				{
					return pp;
				}
			public void setPp(int pp)
				{
					this.pp = pp;
				}

			
	}
			