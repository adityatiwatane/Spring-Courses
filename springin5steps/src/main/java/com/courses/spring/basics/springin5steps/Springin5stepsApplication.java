package com.courses.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
//import com.courses.spring.basics.springin5steps.basic.BinarySearchImpl;
@SpringBootApplication
public class Springin5stepsApplication {

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm);
		//application context

		ApplicationContext applicationContext = SpringApplication.run(Springin5stepsApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
	int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
	System.out.println(result);
	}

}
