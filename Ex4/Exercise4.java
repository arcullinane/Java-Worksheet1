/**
 * program to calculate addition and multiplication of fractions.
 */

public class Exercise4 {

	public static void main(String[] args) {

		// declare variable values e1/d1 and e2/d2

		int e1 = 1;
		int d1 = 4;
		int e2 = 2;
		int d2 = 3;

		// addition calculation

		int es = (e1 * d2) + (e2 * d1);
		int ds = d1 * d2;

		// multiplication calculation

		int ep = e1 * e2;
		int dp = d1 * d2;

		// output to screen
		
		System.out.println(e1 + "/" + d1 + " + " + e2 + "/" + d2 + " = " + es + "/" + ds);
		System.out.println(e1 + "/" + d1 + " x " + e2 + "/" + d2 + " = " + ep + "/" + dp);

	}

}
