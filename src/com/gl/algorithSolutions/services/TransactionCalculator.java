package com.gl.algorithSolutions.services;

public class TransactionCalculator {

	public int CalculateTransactionDay(int[] transactionArray, int target) {
		int totalMoney = 0;
		for (int i = 0;i<transactionArray.length; i++) {
			totalMoney += transactionArray[i];
			if(target<totalMoney) {
				return i+1;
			}				
		}
		return -1;
	}
}
