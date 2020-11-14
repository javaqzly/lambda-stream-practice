package com.javaqzly.lambda.functions;

import java.util.function.ToIntFunction;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ToIntFunctionPracticeTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testToIntFunction() {
		 ToIntFunction<String> toIntFunctiion=Integer::parseInt;
		 System.out.println(toIntFunctiion.applyAsInt("12341"));
	}

}
