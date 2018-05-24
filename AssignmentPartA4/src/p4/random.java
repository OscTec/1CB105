package p4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;

public class random {
	Formatter fmat = new Formatter();
	private int zero;
	private int one;
	private int two;
	private int three;
	private int four;
	private int five;
	private int six;
	private int seven;
	private int eight;

	public void setNumbers() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int j = 1; j <= 9; j++) {
			numbers.add(j);
		}
		Collections.shuffle(numbers);
		zero = numbers.get(0);
		one = numbers.get(1);
		two = numbers.get(2);
		three = numbers.get(3);
		four = numbers.get(4);
		five = numbers.get(5);
		six = numbers.get(6);
		seven = numbers.get(7);
		eight = numbers.get(8);
		
	}

	public int getZero() {
		return zero;
	}
	
	public int getOne() {
		return one;
	}
	public int getTwo() {
		return two;
	}
	
	public int getThree() {
		return three;
	}
	
	public int getFour() {
		return four;
	}
	
	public int getFive() {
		return five;
	}
	
	public int getSix() {
		return six;
	}
	
	public int getSeven() {
		return seven;
	}
	
	public int getEight() {
		return eight;
	}
	
	public String toString(){
		String s = Integer.toString(getZero());
		return (s);
	}
	public String tosZero(){
		String s = Integer.toString(zero);
		return (s);
	}
	public String tosOne(){
		String s = Integer.toString(one);
		return (s);
	}
	public String tosTwo(){
		String s = Integer.toString(two);
		return (s);
	}
	public String tosThree(){
		String s = Integer.toString(three);
		return (s);
	}
	public String tosFour(){
		String s = Integer.toString(four);
		return (s);
	}
	public String tosFive(){
		String s = Integer.toString(five);
		return (s);
	}
	public String tosSix(){
		String s = Integer.toString(six);
		return (s);
	}
	public String tosSeven(){
		String s = Integer.toString(seven);
		return (s);
	}
	public String tosEight(){
		String s = Integer.toString(eight);
		return (s);
	}
	
	
	

}
