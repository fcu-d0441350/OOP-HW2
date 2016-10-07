package fcu.iecs.oop;
import java.util.Scanner;
public class CheckOddEven {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num,a;
		System.out.println("Enter a number");
		num=scanner.nextInt();
		a=num%2;
		if(a==0) {
			System.out.println("The input integer is Even number");
		}
		else if(a==1) {
			System.out.println("The input integer is Odd number");
		}
		scanner.close();

	}

}
