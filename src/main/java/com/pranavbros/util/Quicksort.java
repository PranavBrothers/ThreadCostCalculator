package com.pranavbros.util;

public class Quicksort {
	
	public void sort(int arr[], int begin, int end) {
		if (begin < end) {
			int partitionIndex = partition(arr, begin, end);
			sort(arr, begin, partitionIndex - 1);
			sort(arr, partitionIndex + 1, end);
		}
	}

	private int partition(int numbers[], int begin, int end) {
		int pivot = numbers[end];
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
