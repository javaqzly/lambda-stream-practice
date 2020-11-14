package com.javaqzly.lambda.functions;

import java.util.function.IntFunction;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class IntFunctionPracticeTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testToDoubleFunction() {
		 IntFunction<String> d=(item)->item+"good test!";
		 System.out.println(d.apply(3));
	}

}
