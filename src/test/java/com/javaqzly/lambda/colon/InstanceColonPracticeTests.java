package com.javaqzly.lambda.colon;

import java.util.Random;
import java.util.function.UnaryOperator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InstanceColonPracticeTests {

	@Test
	void contextLoads() {
	}

	/**
	 * 通过实例对象来操作实例方法
	 */
	@Test
	public void testInstanceColon() {
		 Random r=new Random();
		 UnaryOperator<Integer> randomInt=r::nextInt;
		 System.out.println(randomInt.apply(100));
	}

}
