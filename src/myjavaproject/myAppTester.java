/**
 * 
 */
package myjavaproject;

import java.util.Scanner;

/**
 * @author Tobit Sabu
 *
 */
public class myAppTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


		/*
		 * Git is on branch 1 now
		 */

		int num;
		Scanner input = new Scanner(System.in);
		System.out.println("Hello welcome to software engineering");
		System.out.println("Enter the number to find the sum");
		num = input.nextInt();
		System.out.println("Sum of digits = "+sumOfDigits(num));

		
		

	}
    public static int sumOfDigits(int n) {
    	int sum =0,d;
    	while(n > 0)
        {
            d = n % 10;
            sum = sum + d;
            n = n / 10;
        }
    	return sum;
    }
}
