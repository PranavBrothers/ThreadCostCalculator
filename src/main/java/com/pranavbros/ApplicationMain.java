package com.pranavbros;

import static spark.Spark.get;

import java.util.Arrays;

import com.pranavbros.service.impl.ThreadCostCalculator;

public class ApplicationMain {
	//http://localhost:4567/tcc/20,4,8,2
	public static void main(String[] args) {
		 get("/tcc/:inputArray", (req, res) -> {
			int[] inputArray = Arrays.asList(req.params(":inputArray").split(","))
                    .stream()
                    .map(String::trim)
                    .mapToInt(Integer::parseInt).toArray();
			ThreadCostCalculator threadCostCalculator = new ThreadCostCalculator();
			return threadCostCalculator.getThreadCost(inputArray); 
		 });
	}
}
