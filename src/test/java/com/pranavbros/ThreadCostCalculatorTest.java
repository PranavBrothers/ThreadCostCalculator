package com.pranavbros;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.pranavbros.service.impl.ThreadCostCalculator;

public class ThreadCostCalculatorTest {

	@Test
	public void singleElementArrayCost() {
		ThreadCostCalculator threadCostCalculator = new ThreadCostCalculator();
		assertEquals(20, threadCostCalculator.getThreadCost(new int[] {20}));
	}
	
	@Test
	public void twoElementArrayCost() {
		ThreadCostCalculator threadCostCalculator = new ThreadCostCalculator();
		assertEquals(24, threadCostCalculator.getThreadCost(new int[] {20,4}));
	}
	
	@Test
	public void multipleElementArrayCost() {
		ThreadCostCalculator threadCostCalculator = new ThreadCostCalculator();
		assertEquals(54, threadCostCalculator.getThreadCost(new int[] {20,4,8,2}));
	}
}
