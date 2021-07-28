package typeCasting;

import java.util.Scanner;

public class typeCastingAssignment3 {

	public static void main(String[] args) {
		
		//Converting String to numbers
		
		Scanner stringScanner = new Scanner(System.in);
		System.out.println("Enter the Number!");
		String number = stringScanner.nextLine();
		
		
		byte bNumber = Byte.parseByte(number);
		short sNumber = Short.parseShort(number);
		int iNumber = Integer.parseInt(number);
		long lNumber = Long.parseLong(number);
		double dNumber = Double.parseDouble(number);
		float fNumber = Float.parseFloat(number);
		
		System.out.println(bNumber+" "+sNumber+" "+iNumber+" "+lNumber+" "+dNumber+" "+fNumber);
		
		stringScanner.close();
	}

}
