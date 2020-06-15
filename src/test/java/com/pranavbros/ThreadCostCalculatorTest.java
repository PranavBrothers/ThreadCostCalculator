package com.pranavbros;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.pranavbros.service.impl.ThreadCostCalculator;

public class ThreadCostCalculatorTest {

	@Test
	public void nullElementArrayCost() {
		ThreadCostCalculator threadCostCalculator = new ThreadCostCalculator();
		assertEquals(0, threadCostCalculator.getThreadCost(null));
	}
	
	@Test
	public void singleElementArrayCost() {
		ThreadCostCalculator threadCostCalculator = new ThreadCostCalculator();
		assertEquals(20, threadCostCalculator.getThreadCost(new int[] { 20 }));
	}

	@Test
	public void twoElementArrayCost() {
		ThreadCostCalculator threadCostCalculator = new ThreadCostCalculator();
		assertEquals(24, threadCostCalculator.getThreadCost(new int[] { 20, 4 }));
	}

	@Test
	public void multipleElementArrayCost() {
		ThreadCostCalculator threadCostCalculator = new ThreadCostCalculator();
		assertEquals(54, threadCostCalculator.getThreadCost(new int[] { 20, 4, 8, 2 }));
	}

	@Test
	public void multipleElementBigArrayCost() {
		ThreadCostCalculator threadCostCalculator = new ThreadCostCalculator();
		assertEquals(321, threadCostCalculator.getThreadCost(new int[] { 10, 16, 8, 12, 15, 6, 3, 9, 5 }));
	}

	@Test
	public void multipleElemenHugeArrayCost() {
		ThreadCostCalculator threadCostCalculator = new ThreadCostCalculator();
		assertEquals(1148179404,
				threadCostCalculator.getThreadCost(new int[] { 10, 16, 8, 12, 15, 6, 3, 9, 5, 78, 55, 68, 44, 4454, 178,
						445, 1577, 6698, 1, 111, 157, 178, 487, 877, 1545, 1548, 154545, 155, 57, 154, 87, 4545, 457,
						454, 578, 54871124, 787445, 5451545, 541545454, 54548455, 14545454, 4545, 4545, 454, 3565,
						78454, 115, 1, 5, 154, 5, 1545, 67, 154, 15, 1545, 1545, 154, 1545, 154545, 1545, 7878, 44, 5,
						4, 3, 2, 4545, 54457511, 154 }));
	}
}
