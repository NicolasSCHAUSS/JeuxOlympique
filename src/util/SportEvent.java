package util;

public enum SportEvent {

	StickJump("Saut à la perche"),
	TripleJump("Triple saut"),
	HighJump("Saut en hauteur"),
	LongJump("Saut en longueur"),
	WeightLaunch("Lancé de poids"),
	DiskLaunch("Lancé de disque"),
	JavelotLaunch("Lancé de javelot"),
	HammerLaunch("Lancé de marteau"),
	M100("Course du 100m"),
	M200("Course du 200m"),
	M400("Course du 400m"),
	M800("Course du 800m"),
	M1500("Course du 1500m"),
	M5000("Course du 5000m"),
	M10000("Course du 10 000m"),
	M100Hedges("Course du 100m haies"),
	M110Hedges("Course du 110m haies"),
	M400Hedges("Course du 400m haies"),
	HalfDistanceRace("Course de demie-fond"),
	DistanceRace("Course de fond"),
	KM20Step("Course du 20Km marche"),
	KM50Step("Course du 50Km marche"),
	Marathon("Marathon"),
	Decathlon("Décathlon"),
	Heptatlon("Heptatlon");
	
	private String eventName="";
	
	SportEvent(String event)
	{
		this.eventName = event;		
	}
	
	public String toString()
	{
		return eventName;
	}
}
