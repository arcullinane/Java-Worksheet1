/**
 * program to convert imperial measurements into kgs
 */

public class Exercise2 {

	public static void main(String[] args) {

		// declare input variables and initialize to 0

		int ton = 0;
		int hundredweight = 0;
		int quarter = 0;
		int stone = 0;
		int ounce = 0;
		int drachm = 0;
		int grain = 0;
		int pound = 0;

		// conversion values

		int tonToPound = 2240;
		int hundredweightToPound = 112;
		int quarterToPound = 28;
		int stoneToPound = 14;
		double ounceToPound = (1.0 / 16);
		double drachmToPound = (1.0 / 256);
		double grainToPound = (1.0 / 7000);
		double poundToKg = 0.45359237;

		// input values for part b

		stone = 11;
		pound = 6;

		// calculations

		double outTon = ton * tonToPound * poundToKg;
		double outHunderdweight = hundredweight * hundredweightToPound * poundToKg;
		double outQuarter = quarter * quarterToPound * poundToKg;
		double outStone = stone * stoneToPound * poundToKg;
		double outOunce = ounce * ounceToPound * poundToKg;
		double outDrachm = drachm * drachmToPound * poundToKg;
		double outGrain = grain * grainToPound * poundToKg;
		double outPound = pound * poundToKg;

		System.out.println(stone + " stone " + pound + " pound(s) is " + Math.round(outStone + outPound) + " kilograms");

	}

}
