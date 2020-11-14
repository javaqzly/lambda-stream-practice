package com.javaqzly.stream.end;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StreamForEacheOrderedPracticeTests {

	@Test
	void contextLoads() {
	}

	/**
	 * 返回流中的任意一个
	 */
	@Test
	public void testForEachOrdered() {
		Stream<Integer> oneStream = Arrays.stream(new Integer[] { 12, 33, 44, 55, 23, 333, 77, 99 });
		System.out.println(oneStream.mapToInt(item->item.intValue()).min().orElse(333));
		//oneStream.parallel().forEachOrdered(System.out::println);
		//oneStream.parallel().forEach(System.out::println);
	}
}
