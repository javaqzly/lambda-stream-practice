package com.javaqzly.lambda.functions;

import java.util.function.ToDoubleFunction;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ToDoubleFunctionPracticeTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testToDoubleFunction() {
		 ToDoubleFunction<String> toIntFunctiion=Double::parseDouble;
		 System.out.println(toIntFunctiion.applyAsDouble("12341"));
	}

}
