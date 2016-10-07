package fcu.iecs.oop;
import java.util.Scanner;
public class StringComparator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str1,str2;
		System.out.println("Enter a string 1");
		str1=scanner.next();
		System.out.println("Enter a string 2");
		str2=scanner.next();
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("The two strings are the same");
		}
		else {
			System.out.println("The two strings are not the same");
		}
		scanner.close();

	}

}
