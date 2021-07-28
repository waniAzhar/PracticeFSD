package typeCasting;

import java.util.Scanner;

public class typeCastingAssignment2 {

	public static void main(String[] args) {
		
		//Converting long -> byte , short , double
		
		Scanner scanner = new Scanner(System.in);
		long alpha = scanner.nextLong();
		
		byte bAlpha = (byte) alpha;
		short sAlpha = (short) alpha;
		double dAlpha = alpha;
		
		System.out.println(bAlpha + "  " + sAlpha + "  " + dAlpha);
		System.out.println("---------------------------------------");
		
		//Converting float -> byte , short , double 
		float beta = scanner.nextFloat();
		
		byte bBeta = (byte) beta;
		short sBeta = (short) beta;
		double dBeta = beta;
		
		System.out.println(bBeta + "  " + sBeta + "  " + dBeta);
		System.out.println("---------------------------------------");
		
		//Converting int -> byte , short 
		int gamma = scanner.nextInt();
		
		byte bGamma = (byte) gamma;
		short sGamma = (short) gamma;
		
		System.out.println(bGamma + "  " + sGamma);
		System.out.println("---------------------------------------");
		
		scanner.close();
		
	}

}
