package com.Nathan;

import java.util.Scanner;

/**
 * @author Nathan Henriques
 * @date 06/07/2024
 * a code that prints fizz for multiples of 3, buzz for multiples of 5 and fizz buzz for multiples of both
 */

public class FizzBuzz {

	/**
	 * Main method that runs FizzBuzz
	 * @param args The command line arguments
	 */
	public static void main(String[] args) {

		//asks the user to input the highest number the code will run until
		

		int HighestNum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("input the highest number: ");
		System.out.print(">  ");
		HighestNum = input.nextInt();		
		fizzBuzz(HighestNum);

	}

	
/**
 * prints whether a number is a multiple of 3 with Fizz, multiple of 5 with Buzz and a multiple of 3 and 5 with FizzBuzz
 * @param HighestNum user inputs the highest number of the code
 */
	public static void fizzBuzz(int HighestNum) {
		//calculates which numbers between 0 & HighestNum is a multiple of 3 & 5 and prints fizzbuzz
		for (int i = 1; i < HighestNum + 1; i++) {
			 if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println("FizzBuzz");
			
			//calculates which numbers between 0 & HighestNum is a multiple of 3 and prints fizz
			}
			 else if(i % 3 == 0) {
				 System.out.println("fizz");
				
			}
			 //calculates which numbers between 0 & HighestNum is a multiple of 5 and prints buzz
			 else if (i % 5 == 0) {
				 System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}
}

