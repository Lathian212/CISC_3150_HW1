/* Author: Lathian (Jonathan) Kwiat
 * Date: 2-3-15
 * Course: 3150 OOP
 * Question 9:
 * Write a program that plays a number guessing game with the user. Give 
 * hints to whether the secret number is higher or lower than the user's 
 * guess. When the user finally gets it right, print "Horay!"
 */
import java.util.Random;
import java.util.Scanner;

public class Q9NumGuessingGame {
	public static void main (String [] args) {
		Random rnd = new Random();
		Scanner input = new Scanner(System.in);
		
		int rndNum = rnd.nextInt(100) +1;
		System.out.println("For debugging purposes the random number is: " + rndNum);
		System.out.print("You have entered a number guessing game, guess an integer between 1 and 100: ");
		int guess = input.nextInt();
		while (guess != rndNum){
			if (guess > rndNum) {
				System.out.print("The random int is lower then that. Guess again: ");
			}
			else {
				System.out.print("The random int is greater the that. Guess again:");
			}
			guess = input.nextInt();
		}
		System.out.printf("Horay! You guessed it the number was %d!%n", rndNum);
		input.close();
	}
}

