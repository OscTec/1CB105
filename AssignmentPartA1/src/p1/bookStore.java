package p1;
import java.util.Scanner;

public class bookStore {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Author authorObject = new Author("Harry Thompson", "harry@yahoo.com",'m');
		Book bookObject = new Book ("To kill", "Harry", 7.89, 5);
		System.out.println(authorObject.toString());
		System.out.println(bookObject.toString());
		//System.out.println(scan.nextLine());
		authorObject.arrayTest();
	}

}
