package p1;
import java.util.ArrayList;
import java.util.Formatter;

public class Author {
	private String name;
	private String email;
	private char gender;
	Formatter f = new Formatter();
	ArrayList authorProfile = new ArrayList();
	String AuthorTest[][]={{"bob","evil"},{"dylan","evil2"}};
	
	public Author (String n, String e, char g){
		name = n;
		email = e;
		gender = g;		
	}
	public void arrayTest(){
		System.out.println(AuthorTest[0][1]);
	}
	

	
	public String getName(){
		return name;
	}
	public String getEmail(){
		return email;
	}
	public char getGender(){
		return gender;
	}
	public void setEmail(String e){
		email = e;
	}
	public String toString(){
		f.format("The author's name is " + getName() + ", their email is " + getEmail() + " and they are " + getGender());
		String s = f.toString();
		return (s);
	}

}