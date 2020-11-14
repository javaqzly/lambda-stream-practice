package com.javaqzly.lambda.functions.core;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FunctionPracticeTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testFunction() {
		Function<String, Integer> strToInt = Integer::parseInt;
		strToInt("222", strToInt);
	}

	private void strToInt(String num, Function<String, Integer> strToInt) {
		Integer intValue = strToInt.apply(num);
		System.out.println(intValue);
	}

	@Test
	public void testIdentity() {
		String[] names = new String[] { "jack", "poly", "tencent", "joly" };
		Map<String, String> map = Arrays.stream(names).collect(Collectors.toMap(String::toString, Function.identity()));
		map.forEach((key, value) -> System.out.println("key=" + key + ",value=" + value));
	}

	/**
	 * andThen是先计算当前的函数、再计算组合的函数。
	 * compose则是先计算组合的函数、再计算当前的函数。
	 */
	@Test
	public void testCompose() {
           Function<Integer,Integer> qiuHe=a->a+a;
           Function<Integer,Integer> qiuJi=a->a*a;
           System.out.println(qiuHe.andThen(qiuJi).apply(2));
           System.out.println(qiuHe.compose(qiuJi).apply(2));
	}

}
