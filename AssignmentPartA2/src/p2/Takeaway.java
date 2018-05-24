package p2;
public class Takeaway extends NightSpot {
	
	protected double foodPoisoning;
	protected double fatDoner;
	
	public Takeaway(String name, String street, int coolness, double foodPoisoning, double fatDoner){
	super(name, street, coolness);
	this.foodPoisoning= foodPoisoning;
	this.fatDoner= fatDoner;
}
public void information(){
	System.out.println(name + " is a takeaway on " + street + " it's coolness factor is " + coolness + ", it has " + foodPoisoning + " chance of you getting food poisoning, there are " + fatDoner + " grams of fat in the doner.");
}




}
