/* 
Author: Lathian (Jonathan) Kwiat
Date: 2-1-15
Course: 3150 OOP

Question 3:
Write a program that reads in investment amount, annual interest rate, and 
the number of years and displays the future investment value using the 
following formula:
invest_value = invest_amount * (1 + monthly_interest_rate)^(num_years*12)
Show the output.
*/
import java.math.*;
import java.util.Scanner;

public class Q3InvestmentReturn {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		double investAm = 0.0;
		double interestRate = 0.0;
		double numYears = 0.0;
		double investVal = 0.0;
		double monthlyInterest = 0.0;
		
		System.out.print("Enter the starting investment amount:");
		investAm = input.nextDouble();
		System.out.print("Enter the annual interest rate:");
		interestRate = input.nextDouble();
		monthlyInterest = interestRate/12;
		System.out.print("Enter the number of years the investment accrues:");
		numYears = input.nextDouble();
		investVal = investAm * Math.pow((1 + monthlyInterest), (numYears*12));
		System.out.printf("invest_value = invest_amount * (1 + monthly_interest_rate)^(num_years*12) = %.2f%n", investVal);
	}
}