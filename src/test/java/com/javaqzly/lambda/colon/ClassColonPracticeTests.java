package com.javaqzly.lambda.colon;

import java.util.Random;
import java.util.function.Function;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ClassColonPracticeTests {

	@Test
	void contextLoads() {
	}

	/**
	 * 通过类目来操作实例方法
	 */
	@Test
	public void testClassColon() {

		Function<Random, Integer> randomInt = Random::nextInt;
		System.out.println(randomInt.apply(new Random()));
	}

}
