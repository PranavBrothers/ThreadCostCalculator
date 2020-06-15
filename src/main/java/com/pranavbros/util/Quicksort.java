package com.pranavbros.util;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Quicksort {
	
	private static final Logger logger = LoggerFactory.getLogger(Quicksort.class);

	public static void sort(int[] numbers) {
		logger.info("******************************************************************");
		logger.info("InputArray -->{}", Arrays.toString(numbers));
		long startTime = System.currentTimeMillis();
		sort(numbers,0, numbers.length-1);
		logger.info("Quicksort Time Taken -->{}",  System.currentTimeMillis() - startTime);
		logger.info("SortedArray -->{}" , Arrays.toString(numbers));
		logger.info("******************************************************************");
	}
			
	private static  void sort(int numbers[], int begin, int end) {
		if (begin < end) {
			logger.info("Invoked Sort Method ------>{}", Arrays.toString(numbers));
			int partitionIndex = partition(numbers, begin, end);
			logger.info("Partition Index ------>{}", partitionIndex);
			sort(numbers, begin, partitionIndex - 1);
			sort(numbers, partitionIndex + 1, end);
		}
	}

	private static int partition(int numbers[], int begin, int end) {
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
	
	private static void swapNumbers(int[] numbers, int i, int j) {
		if(i!=j) {
			logger.info("Swap Indexes ------>{}-{}", i,j);
			int temp = numbers[i];
			numbers[i] = numbers[j];
			numbers[j] = temp;
		}
    }
}
