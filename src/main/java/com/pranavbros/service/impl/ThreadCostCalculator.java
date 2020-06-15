package com.pranavbros.service.impl;
import com.pranavbros.service.ThreadCostCalculatorService;
import com.pranavbros.util.Quicksort;

public class ThreadCostCalculator implements ThreadCostCalculatorService{
	
	public int getThreadCost(int[] inputArray) {
		if(inputArray.length<2) {
			return inputArray[0];
		}else { //(inputArray.length>1) 
			Quicksort qs = new Quicksort();
			int[] sortedArray = qs.sort(inputArray);
			int sum = sortedArray[0] + sortedArray[1];
			int stepsSum = 0;
			for(int i=2; i<sortedArray.length; i++) {
				stepsSum = stepsSum+sum;
				sum = sum + sortedArray[i];
			}
			return (sum+stepsSum);
		} 
	}
	
}