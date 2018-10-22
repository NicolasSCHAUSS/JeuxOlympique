package dao;

import util.*;

public class Athlete {

	private String firstname;
	private String lastname;
	
	private Medal medal;

	/**
	 * @param competition
	 */
	public Athlete(String firstname, String lastname, Medal medal) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.medal = medal;
	}
	
	public String toString()
	{
		if (medal!=null)
		{
			return "[Athlète "+ this.firstname +" "+this.lastname +" detient une "+ this.medal+"]\r\n";
		}
		else
		{
			return "[Athlète "+ this.firstname +" "+this.lastname +" n'a pas de medaille]\r\n";
		}
		
	}
	
}
