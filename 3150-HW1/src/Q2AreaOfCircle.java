/* Author: Lathian (Jonathan) Kwiat
 * Date: 2-1-15
 * Course: 3150 OOP
 */

import java.math.*;
import java.util.Scanner;

public class Q2AreaOfCircle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double radius = 0.0;
		
		while (true) {
			System.out.print("Please enter a double for a radius of a circle or ctrl-d to end:");
			radius = input.nextDouble();
			if (radius <= 0) {
				System.out.println("You entered an illegal value for circle!");
				continue;
			}
			System.out.printf("The area of a circle with radius = %.2f is %.2f%n", radius, (Math.PI*Math.pow(radius, 2)));
		}
	}

}
