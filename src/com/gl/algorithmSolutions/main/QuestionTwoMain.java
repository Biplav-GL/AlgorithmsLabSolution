package com.gl.algorithmSolutions.main;
import java.util.Scanner;

import com.gl.algorithSolutions.services.MergeSort;
import com.gl.algorithSolutions.services.MinimumNotesCalculator;


public class QuestionTwoMain {

	public static void main(String[] args) {
		
		//Taking the inputs from the User
		Scanner sc = new Scanner(System.in);
		
		//Input the Number of Currency Present
		System.out.println("Enter the size of currency denominations");
		int sizeOfCurrencyDeno = sc.nextInt();
		
		//Storing the Currency Denomination in an Array
		int[] currencyDenomination = new int[sizeOfCurrencyDeno];
		System.out.println("Enter the currency denominations value");
		for(int counter = 0; counter<sizeOfCurrencyDeno; counter++) {
			currencyDenomination[counter] = sc.nextInt();
		}
		
		//sort the array	
		MergeSort.sort(currencyDenomination, 0, currencyDenomination.length-1);
				
		//Taking the Input from User for the amount to be paid
		System.out.println("Enter the amount you want to pay");
		int amountToPay = sc.nextInt();

		//Creating the Object and calling the Function to get the Minimum Notes
		MinimumNotesCalculator minNotes = new MinimumNotesCalculator();
		int [][] denominationDetails = minNotes.getDenominations(currencyDenomination, amountToPay);
		
		//Displaying the Output
		System.out.println("Your payment approach in order to give min no of notes will be");
		for(int i = 0; i<denominationDetails.length; i++) {
			if(denominationDetails[i][0] != 0) {
				System.out.println(denominationDetails[i][0]+ ":" + denominationDetails[i][1]);				
			}
		}
		sc.close();
	}
}

