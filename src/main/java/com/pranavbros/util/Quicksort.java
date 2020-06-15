package com.pranavbros.util;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Quicksort {
	
	private static final Logger logger = LoggerFactory.getLogger(Quicksort.class);

	public void sort(int arr[]) {
		logger.info("******************************************************************");
		logger.info("InputArray -->{}", Arrays.toString(arr));
		int arrayLength = arr.length;
		long startTime = System.currentTimeMillis();
		sort(arr,0, arrayLength-1);
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		logger.info("Quicksort Time Taken -->{}", elapsedTime);
		logger.info("SortedArray -->{}" , Arrays.toString(arr));
		logger.info("******************************************************************");
	}
			
	private void sort(int arr[], int begin, int end) {
		if (begin < end) {
			logger.info("Invoked Sort Method ------>{}", Arrays.toString(arr));
			int partitionIndex = partition(arr, begin, end);
			sort(arr, begin, partitionIndex - 1);
			sort(arr, partitionIndex + 1, end);
		}
	}

	private int partition(int numbers[], int begin, int end) {
		int pivot = numbers[end];
		logger.info("Pivot number ------>{}", pivot);
		int i = (begin - 1);
		for (int j = begin; j < end; j++) {
			if (numbers[j] <= pivot) {
				i++;
				swapNumbers(numbers, i, j);
			}
		}
		swapNumbers(numbers, i + 1,  end);
		return i + 1;
	}
	
	private void swapNumbers(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
