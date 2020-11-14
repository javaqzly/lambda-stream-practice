package com.javaqzly.stream.end;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StreamNoneMatchOrderedPracticeTests {

	@Test
	void contextLoads() {
	}

	/**
	 * 返回流中的任意一个
	 */
	@Test
	public void testForNoneMatch() {
		Stream<Integer> oneStream = Arrays.stream(new Integer[] { 12, 33, 44, 55, 23, 333, 77, 99 });
		 //oneStream.parallel().forEachOrdered(System.out::println);
		 //System.out.println(oneStream.noneMatch(item->item.intValue()<33));
		 
		Object[] obj = oneStream.toArray();
		for(Object o:obj) {
			System.out.println(o);
		}
	}
}
