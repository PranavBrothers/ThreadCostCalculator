package com.pranavbros.service.impl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pranavbros.service.ThreadCostCalculatorService;
import com.pranavbros.util.Quicksort;

public class ThreadCostCalculator implements ThreadCostCalculatorService{
	
	private static final Logger logger = LoggerFactory.getLogger(ThreadCostCalculatorService.class);
	
	public int getThreadCost(int[] inputArray) {
		try {
			if(inputArray.length>=2) {
				new Quicksort().sort(inputArray);
				return getTotalCost(inputArray);
			}
		} catch (Exception e) {
			logger.error("Unexpected Error-->{}" , e.getMessage());
		} 
		return 0;
	}
	
	private int getTotalCost(int[] sortedInputArray) {
		int sum = sortedInputArray[0] + sortedInputArray[1];
		int stepsSum = 0;
		for(int i=2; i<sortedInputArray.length; i++) {
			stepsSum = stepsSum+sum;
			sum = sum + sortedInputArray[i];
		}
		return (sum+stepsSum);
	}
	
}