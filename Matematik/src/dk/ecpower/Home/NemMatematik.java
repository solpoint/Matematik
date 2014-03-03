package dk.ecpower.Home;

import java.math.BigInteger;

public class NemMatematik {

	
	
	int[] tal = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 120, 140};
	
	
	private float calculateMean(){
	
		float mean = 0;
		
		for(int k=0; k<tal.length; k++){
			mean = tal[k] + mean;
		}
		return Math.round(mean = (float) 1/tal.length*mean);
		
	}
	
	private double calculateStdDev(float mean){
		double stddev = 0;
		
		stddev = (float) 1/tal.length * Math.sqrt( Math.pow(10-mean, 2));
		
		return stddev;
	}
	
	private static String hexToBin(String s){
		return new BigInteger(s, 16).toString(2);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 
		
		//Integer outputDecimal = Integer.parseInt("2F2F", 2);
         System.out.println("Decimal Equivalent : " + hexToBin("2F2F") + "\n");
         
         
         
		//System.out.println(new NemMatematik().calculateStdDev(new NemMatematik().calculateMean()));

	}

}
