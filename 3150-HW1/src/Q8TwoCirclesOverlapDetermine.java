/* Author: Lathian (Jonathan) Kwiat
 * Date: 2-3-15
 * Course: 3150 OOP
 * Question 8:
 * Write a program that prompts the user to enter the center coordinates and 
 * radiuses of two circles. Determine whether the are separate from each 
 * other, touching each other, overlapping each other, or completely within 
 * one another. Test each case and show the output.
 */
// To solve to ask the professor for help with his:
/* The way you calculate the distance between two points is: sqrt((x2-x1)^2 + (y2-y1)^2)

Variable names:
center distance = distance from the center of the first circle to the center of the second circle.
smaller radius = the radius of the smaller circle
greater radius = the radius of the bigger circle.

Test cases:
If center distance > the first radius + second radius, they're not touching each other.
-> From prof I think is wrong
If center distance = first + second radius, the circles are touching each other.
-> center distance = 0 and (first - second radius) = 0 then superimposed
If center distance < first + second radius, that means they're either overlapping, or one of the circles is completely inside the other circle. In this case, you should run two test cases:

If the center distance + the smaller radius <= the greater radius, one of the circles is completely in the other one.

If the center distance + the smaller radius > the greater radius, the circles overlap.
*/
import java.math.*;
import java.util.Scanner;

public class Q8TwoCirclesOverlapDetermine {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		double radius, xCord, yCord;
		Circle c1, c2;
		while (true) {
			System.out.println("Enter ctr-d to terminator program or");
			System.out.print("For Circle 1: enter radius: ");
			radius = input.nextDouble();
			System.out.print("For Circle 1: enter x cordinate, followed by a space, y cordinate then enter: ");
			xCord = input.nextDouble();
			yCord = input.nextDouble();
			c1 = new Circle(radius, xCord, yCord);
			System.out.print("For Circle 2: enter radius: ");
			radius = input.nextDouble();
			System.out.print("For Circle 2: enter x cordinate, followed by a space, y cordinate then enter: ");
			xCord = input.nextDouble();
			yCord = input.nextDouble();
			c2 = new Circle(radius, xCord, yCord);
			c1.containsStatus(c2);
		}
	}
}