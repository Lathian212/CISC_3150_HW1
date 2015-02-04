/* 
Author: Lathian (Jonathan) Kwiat
Date: 2-2-15
Course: 3150 OOP

Question 5:
Generate a 3 digit lottery number. The program prompts the user to enter a 
3 digit number and determines whether the user wins according to the 
following rules:
1) If the user input matches the lottery number in the exact order, the 
award is $10,000
2) If all the digits in the user input match all the digits in the lottery 
number, the award is $3,000.
3) If one digit in the user input matches a digit in the lottery number, 
the award is $1,000.
Test all three cases & show the output.
*/
import java.util.Random;
import java.util.Scanner;

public class Q5LotteryGame {
    public static void main (String [] args) {
    	Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        int rndDigit = 0;
        int [] lotteryNum = new int[3];
        
        // Generate a three digit random number
        // Easily can pack this into a method with n specifying the number
        // of digits if needed. 
        // lotterNum[0] is the little end.
        for (int i = 0; i <3; i++){
        	rndDigit = rnd.nextInt(10);
        	while (i == 2 && rndDigit == 0) {
        		rndDigit = rnd.nextInt(10);
        	}
        	lotteryNum[i] = rndDigit;
        }
        System.out.print("The lottery num for testing purposes is = ");
        for (int i = 2; i >= 0; i--){
        	System.out.print(lotteryNum[i]);
        }
        System.out.println("");
        
        System.out.print("Please enter your guess for the lottery number: ");
        int guess = input.nextInt();
        // Chop off digits from the right end compare to lotteryNum array
        // Exact match is a special case I flag with a bool
        boolean perfectMatch = false;
        int digitCand = 0;
        int numRight = 0;
        for (int i= 0; i < 3; i++) {
        	digitCand = guess%10;
        	guess /= 10;
        	for (int j = 0; j < 3; j++) {
        		if (lotteryNum[j] == digitCand) {
        			if (j == i) {
        				perfectMatch = true;
        			}
        			else  {
        				perfectMatch = false;
        			}
        			numRight++;
        			// not the best solution but for lottery numbers this works
        			// maybe an array of Integers? IE. boxing.
        			lotteryNum[j] = -1;
        		}		
        	}
        }
        // Tallying up the pay-out. Note specs there is no award for two 
        // matches. So I provided one.
        if (perfectMatch && numRight == 3) {
        	System.out.println("You won! An exact match! $10,000 is yours!");
        }
        else if (numRight == 3){
        	System.out.println("You won! All three numbers but out of order." +
        			"! $3,000 is yours!");
        }
        else if (numRight == 2){
        	System.out.println("You won! You got two numbers." +
			"! $2,000 is yours!");
        }
        else if (numRight == 1){
        	System.out.println("You won! You got one number." +
			"! $1,000 is yours!");     	
        }
        else {
        	System.out.println("You lose SUCKER! Didn't your mommy ever" +
        			" explain statistics to ya?");
        }
    }
}