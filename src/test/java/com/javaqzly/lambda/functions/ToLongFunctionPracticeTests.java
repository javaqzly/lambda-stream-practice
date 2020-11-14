package com.javaqzly.lambda.functions;

import java.util.function.ToLongFunction;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ToLongFunctionPracticeTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testToLongFunction() {
		 ToLongFunction<String> toIntFunctiion=Long::parseLong;
		 System.out.println(toIntFunctiion.applyAsLong("12341"));
	}

}
