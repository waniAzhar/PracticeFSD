package consoleCalculator;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter First Number : ");
		float num1 = scanner.nextFloat();
		System.out.println("Enter the Operator : ");
		char character = scanner.next().charAt(0);
		System.out.println("Enter Second Number : ");
		float num2 = scanner.nextFloat();
		
		
		scanner.close();
		
		switch( character ) {
		case '+' : System.out.printf("%.2f + %.2f = %.2f", num1,num2,(num1+num2));
		break;
		
		case '-' : System.out.printf("%.2f - %.2f = %.2f", num1,num2,(num1-num2));
		break;
		
		case '*' : System.out.printf("%.2f * %.2f = %.2f", num1,num2,(num1*num2));
		break;
		
		case '/' :
			if (num2 != 0) {
				System.out.printf("%.2f / %.2f = %.2f", num1,num2,(num1/num2));
				}
			else {
				System.out.println("Not Defined");
			}
		break;
		
		default : System.out.println("Invalid Operator");
		}
		
		

	}

}
