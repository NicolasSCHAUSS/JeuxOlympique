package dao;

import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import util.Medal;
import util.SportEvent;

/**
 * EventsDao Class, reference sport events by athlete goals medals  
 * @author nschauss
 */
public class EventsDao {

	/**
	 * EventsDao Attribute
	 */
	private TreeMap<SportEvent,List<Athlete>> competitors;
	
	/**
	 * EventsDao Constructor
	 */
	public EventsDao()
	{
		competitors = new TreeMap<SportEvent,List<Athlete>>();
		List<Athlete> tempAthletes = buildAthleteList();
		
		competitors.put(SportEvent.M100,tempAthletes);
		competitors.put(SportEvent.DiskLaunch,tempAthletes);
		competitors.put(SportEvent.Marathon,tempAthletes);
	}
	
	/**
	 * Build Athlete list and sport event result (medal)
	 * @param nb
	 * @return Athlete list DAO
	 */
	private List<Athlete> buildAthleteList()
	{
		String name[] = {"Riri", "Fifi","Loulou","Donald","Picsou","Daisy","Gontran"};
		
		return IntStream.range(0, 7)
				 //Loop on index 0 -7, using ternary for athlete without medal
				 .mapToObj(i->new Athlete(name[i], "DUCK",((i<3)?Medal.values()[i]:null)))
				 //Return Athlete list
				 .collect(Collectors.toList());
	}
	
	public void showEventsResults()
	{
		//Loop by using lambda to build Athlete results grouped by 
		competitors.forEach((se,a)->System.out.println(a.toString()+" pour l'evenement sportif : "+se.toString()));
	}
}
