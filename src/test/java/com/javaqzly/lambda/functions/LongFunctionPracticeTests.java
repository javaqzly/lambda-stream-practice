package com.javaqzly.lambda.functions;

import java.util.function.LongFunction;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LongFunctionPracticeTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testToDoubleFunction() {
		 LongFunction<String> d=(item)->item+"good test!";
		 System.out.println(d.apply(3));
	}

}
