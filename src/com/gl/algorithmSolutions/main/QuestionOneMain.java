package com.gl.algorithmSolutions.main;
import java.util.Scanner;
import com.gl.algorithSolutions.services.TransactionCalculator;

public class QuestionOneMain {

	public static void main(String[] args) {

		//Taking the inputs from the User
		Scanner sc = new Scanner(System.in);
		
		//Input size of Transaction Array
		System.out.println("Enter the size of Transaction Array");
		int arraySize = sc.nextInt();
		int[] transactionArray = new int[arraySize];
		
		//Taking the values of array as a String in one Line (Following question Test Case)
		sc.nextLine();
		System.out.println("Enter the values of array");
		String inputArrayValues = sc.nextLine();
		String[] arrayValues = inputArrayValues.split(" ");		   
		for(int counter = 0; counter < arraySize; counter++) {
			transactionArray[counter] = Integer.parseInt(arrayValues[counter]);
		}
		
		//Asking about the number of Transaction needed.
		System.out.println("Enter the total no of targets that needs to be achieved");
		int numberOfTargets = sc.nextInt();
		TransactionCalculator tc = new TransactionCalculator();
		
		//Looping for Number of Transactions to be verified.
		for(int counter = 0; counter<numberOfTargets; counter++) {
			System.out.println("Enter the value of target");
			int target = sc.nextInt();
			int transcationDay = tc.CalculateTransactionDay(transactionArray, target);
			if (transcationDay == -1) {
				System.out.println("Given target is not achieved ");
			}else {
				System.out.println("Target achieved after " + transcationDay + " transactions");
			}
		}
		sc.close();
	}
}
