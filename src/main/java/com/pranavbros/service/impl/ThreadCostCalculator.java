package com.pranavbros.service.impl;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pranavbros.service.ThreadCostCalculatorService;
import com.pranavbros.util.Quicksort;

public class ThreadCostCalculator implements ThreadCostCalculatorService{
	
	private static final Logger logger = LoggerFactory.getLogger(ThreadCostCalculatorService.class);
	
	public int getThreadCost(int[] inputArray) {
		int arrayLength = inputArray.length;
		if(arrayLength<2) {
			return inputArray[0];
		}else { //(inputArray.length>1) 
			
			long startTime = System.currentTimeMillis();
			logger.info("InputArray -->{}", Arrays.toString(inputArray));
			Quicksort qs = new Quicksort();
			qs.sort(inputArray,0, arrayLength-1);
			long stopTime = System.currentTimeMillis();
			long elapsedTime = stopTime - startTime;
			logger.info("Quicksort Time Taken -->{}", elapsedTime);
			logger.info("SortedArray -->{}" , Arrays.toString(inputArray));
			
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