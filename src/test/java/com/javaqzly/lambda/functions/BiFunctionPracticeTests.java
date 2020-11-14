package com.javaqzly.lambda.functions;

import java.util.function.BiFunction;
import java.util.function.Function;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BiFunctionPracticeTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testFunction() {
		BiFunction<Integer, Integer, Integer> qiuHe = (a, b) -> a + b;
		Function<Integer, Integer> qiuJi = a -> a * a;
		System.out.println(qiuHe.apply(3, 4));
		System.out.println(qiuHe.andThen(qiuJi).apply(3, 4));
	}

}
