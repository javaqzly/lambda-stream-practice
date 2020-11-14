package com.javaqzly.lambda.functions;

import java.util.function.BinaryOperator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BinaryOperatorPracticeTests {

	@Test
	void contextLoads() {
	}

	/**
	 * 一元操作符 主要用来对入参和出参相同的lambda表达式的抽象
	 */
	@Test
	public void testBanaryOprator() {
		BinaryOperator<Integer> intToStr = (x, y) -> x + y;
		System.out.println(intToStr.apply(5, 6));
		System.out.println(intToStr.apply(8, 9));
	}

}
