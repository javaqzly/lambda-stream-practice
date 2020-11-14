package com.javaqzly.lambda.functions.core;

import java.util.function.Predicate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PredicatePracticeTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testPredicate() {
		Predicate<Integer> oddPredicate = item -> item % 2 == 0 ? true : false;

		Predicate<Integer> moreThan5Predicate = item -> item > 5 ? true : false;

		printHelloWorld(oddPredicate,moreThan5Predicate);
	}

	private void printHelloWorld(Predicate<Integer> predicateOne,Predicate<Integer> predicateTwo) {
		if (predicateOne.test(2)) {
			System.out.println("helloWorld!");
		} else {
			System.out.println("good morning!");
		}
		System.out.println(predicateOne.or(predicateTwo).test(2));
		System.out.println(predicateOne.and(predicateTwo).test(8));
		System.out.println(predicateOne.negate().test(2));
		Predicate<Integer> fourPredicate = Predicate.isEqual(new Integer(4));
		System.out.println(fourPredicate.test(4));
		System.out.println(fourPredicate.test(8));
	}

}
