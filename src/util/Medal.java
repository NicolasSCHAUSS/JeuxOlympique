package util;

public enum Medal {

	Or(1), 
	Argent(2),
	Bronze(3);
	
	private int position=0;
	
	Medal(int position)
	{
		this.position =  position;		
	}
	
	public String toString()
	{
		String str = "Medaille ";
		
		switch(this.position)
		{
			case 1:
				str += "d'Or";
				break;
			case 2:
				str += "d'Argent";
				break;
			case 3:
				str += "de Bronze";
				break;
			default:
				break;
		}
		return str;
	}
}
