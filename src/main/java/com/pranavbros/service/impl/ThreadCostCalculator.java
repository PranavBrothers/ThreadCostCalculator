package com.pranavbros.service.impl;
import com.pranavbros.service.ThreadCostCalculatorService;
import com.pranavbros.util.Quicksort;

public class ThreadCostCalculator implements ThreadCostCalculatorService{
	
	public int getThreadCost(int[] inputArray) {
		int arrayLength = inputArray.length;
		if(arrayLength<2) {
			return inputArray[0];
		}else { //(inputArray.length>1) 
			Quicksort qs = new Quicksort();
			qs.sort(inputArray,0, arrayLength-1);
			int sum = inputArray[0] + inputArray[1];
			int stepsSum = 0;
			for(int i=2; i<inputArray.length; i++) {
				stepsSum = stepsSum+sum;
				sum = sum + inputArray[i];
			}
			return (sum+stepsSum);
		} 
	}
	
}