/**
 * program to calculate the angle between the hands of a clock given a time
 */

public class Exercise5 {

	public static void main(String[] args) {

		// declare time variables
		double hours = 4;
		double minutes = 41;

		// calculate the angle of individual hands (% to deal with 24 hours)
		double minuteAngle = minutes * 6;
		double hourAngle = ((hours * 30) + (minutes / 60) * 30) % 360;

		// calculate the difference in angles (% to deal with distance of minute hand from 0 or 360)
		double diffAngle = Math.round((hourAngle + (360 - minuteAngle)) % 360);

		System.out.println((int) (diffAngle));
	}

}
