package com.javaqzly.lambda.functions;

import java.util.function.DoubleFunction;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DoubleFunctionPracticeTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testDoubleFunction() {
		 DoubleFunction<String> d=(item)->item+"good test!";
		 System.out.println(d.apply(3));
	}

}
