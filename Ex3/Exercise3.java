/**
 * program to calculate interest
 */

public class Exercise3 {

	public static void main(String[] args) {

		// declare and initialize variables
		
		double capital = 100;
		double interestRate = 2.3;

		// output to screen
		
		System.out.println("Year 1 = " + (int)(calculation(capital, interestRate, 1)));
		System.out.println("Year 2 = " + (int)(calculation(capital, interestRate, 2)));
		System.out.println("Year 3 = " + (int)(calculation(capital, interestRate, 3)));
		System.out.println("Year 4 = " + (int)(calculation(capital, interestRate, 4)));
		System.out.println("Year 5 = " + (int)(calculation(capital, interestRate, 5)));
		System.out.println("Year 500 = " + (int)(calculation(capital, interestRate, 500)));
	}

	// method to calculate interest
	
	public static double calculation(double capital, double interestRate, int years) {

		double total = Math.round(capital * Math.pow((1 + 0.01 * interestRate), years));
		return (int) total;

	}
}
