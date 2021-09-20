package com.gl.algorithSolutions.services;

public class TransactionCalculator {

	public int CalculateTransactionDay(int[] tansactionArray, int target) {
		int totalMoney = 0;
		for (int i = 0;i<tansactionArray.length; i++) {
			totalMoney += tansactionArray[i];
			if(target<totalMoney) {
				int transcationDay = i+1;
				return transcationDay;
			}				
		}
		return -1;
	}
}
