package fcu.iecs.oop;
import java.util.Scanner;
public class PrintNumberInWord {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		System.out.println("Enter a integer");
		num=scanner.nextInt();
		if(num>=1 && num<=9) {
			switch(num) {
			case 1:
				System.out.println("The input integer is \"ONE\"");
				break;
			case 2:
				System.out.println("The input integer is \"TWO\"");
				break;
			case 3:
				System.out.println("The input integer is \"THREE\"");
				break;
			case 4:
				System.out.println("The input integer is \"FOUR\"");
				break;
			case 5:
				System.out.println("The input integer is \"FIVE\"");
				break;
			case 6:
				System.out.println("The input integer is \"SIX\"");
				break;
			case 7:
				System.out.println("The input integer is \"SEVEN\"");
				break;
			case 8:
				System.out.println("The input integer is \"EIGHT\"");
				break;
			case 9:
				System.out.println("The input integer is \"NINE\"");
				break;	
			}
		}
		else {
			System.out.println("The input integer is \"OTHER\"");
		}
		scanner.close();

	}

}
