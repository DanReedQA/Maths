package Maths1;

public class Runner2 {

	public static int numOne = 1;
	public static int numTwo = 2;
	
	public static double numThree = 3;
	public static double numFour = 4;
	
	public static void main(String[] args) {
		
		System.out.println(numOne + numTwo); 
		System.out.println(numOne * numTwo); 
		System.out.println(numOne - numTwo); 
		
		if (numThree > numFour) {
			
			System.out.println(numThree / numFour);
	
		}
	
		else {
			System.out.println("Cannot Divide");
		}	
	
	}
}