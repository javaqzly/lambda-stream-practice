package com.javaqzly.lambda.functions;

import java.util.function.BiConsumer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BiConsumerPracticeTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testBiConsumer() {
		BiConsumer<Integer, Integer> biConsumer = (x, y) -> System.out.println(x + y);
		biConsumer.accept(5, 5);
	}

}
