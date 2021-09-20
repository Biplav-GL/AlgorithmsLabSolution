package com.gl.algorithSolutions.services;

public class MinimumNotesCalculator {

	public int[][] getDenominations(int[] currencyDenomination, int amountToPay){
		int[][] denominationDetails = new int[currencyDenomination.length][2];
		try {
			for(int i = 0; i<currencyDenomination.length; i++) {
				if (amountToPay/currencyDenomination[i] == 0) {
					continue;
				}else {
					denominationDetails[i][0] = currencyDenomination[i];
					denominationDetails[i][1] = amountToPay/currencyDenomination[i];
					amountToPay %= currencyDenomination[i];
				}
			}
		}catch(ArithmeticException e){
			System.out.println("Error" + e.getMessage());
		}
		return denominationDetails;
	}
}
