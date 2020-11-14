package com.javaqzly.lambda.functions;

import java.util.function.UnaryOperator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UnaryOperatorPracticeTests {

	@Test
	void contextLoads() {
	}

	/**
	 * 一元操作符 主要用来对入参和出参相同的lambda表达式的抽象
	 */
	@Test
	public void testFunction() {
		UnaryOperator<Integer> unary = x -> x + 2;
		System.out.println(unary.apply(3));
		System.out.println(unary.apply(5));
	}

}
