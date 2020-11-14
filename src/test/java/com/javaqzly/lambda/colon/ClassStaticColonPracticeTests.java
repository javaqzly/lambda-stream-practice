package com.javaqzly.lambda.colon;

import java.util.function.ToDoubleFunction;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ClassStaticColonPracticeTests {

	@Test
	void contextLoads() {
	}

	/**
	 * 通过类目来操作实例方法
	 */
	@Test
	public void testClassStaticColon() {
		ToDoubleFunction<Integer>  consumer=Math::abs;
		System.out.println(consumer.applyAsDouble(13141));
	}

}
