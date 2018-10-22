package main;

import dao.EventsDao;

public class Main {

	public static void main(String[] args)
	{
		EventsDao registreOlympique = new EventsDao();
		registreOlympique.showEventsResults();
	}

}
