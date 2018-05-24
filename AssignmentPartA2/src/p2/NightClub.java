package p2;

public class NightClub extends NightSpot{
	
	protected int dancefloorCount;
	protected double djQuality;
	protected double WKD;
	
	public NightClub(String name, String street, int coolness, int dancefloorCount, double djQuality, double WKD) {
	super(name, street, coolness);
	this.dancefloorCount= dancefloorCount;
	this.djQuality= djQuality;
	this.WKD= WKD;
	}
	public void information(){
		System.out.println(name + " is a Night club on " + street + " it's coolness factor is " + coolness + ", it has " + dancefloorCount + " dance floors, the DJ has a quality of " + djQuality + " and WKD is only " + WKD + ".");
	}

}
