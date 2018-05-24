package p2;

public class Pub extends NightSpot{
	
	protected int bookCount;
	protected double grump;	
	
	public Pub(String name, String street, int coolness,int bookcount, double grump) {
		super(name, street, coolness);
		this.bookCount= bookcount;
		this.grump= grump;
	}
	
	public void information(){
		System.out.println(name + " is a pub on " + street + " it's coolness factor is " + coolness + ", it has " + bookCount + " books, the owner has a grumpiness score of " + grump + ".");
	}
}

