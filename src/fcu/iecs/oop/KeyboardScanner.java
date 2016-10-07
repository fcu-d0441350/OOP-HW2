package fcu.iecs.oop;
import java.util.Scanner;
public class KeyboardScanner {

	public static void main(String[] args) {
		int num1;
		float num2,num3;
		String name;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a integer");
		num1=scanner.nextInt();
		System.out.println("Enter a float point number");
		num2=scanner.nextFloat();
		num3=num1*num2;
		System.out.println("Enter a name");
		name=scanner.next();
		System.out.printf("Hi " + name + ", the multiplication of " + num1 +" and " + num2 + " is ");
		System.out.printf("%.2e",num3);
		scanner.close();

	}

}
