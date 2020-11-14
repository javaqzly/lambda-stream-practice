package com.javaqzly.lambda.complex;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.Predicate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 主要用来验证和测试高阶函数
 *
 */
@SpringBootTest
class HighLevelFunctionPracticeTests {

	@Test
	void contextLoads() {
	}

	private static <T> Predicate<T> notEqual(T t) {
		return v -> !Objects.equals(v, t);
	}

	@Test
	public void testHighLevelFunction() {
		Arrays.stream(new Integer[] { 1, 2, 3 }).filter(notEqual(1)).forEach(System.out::println);
	}

}
