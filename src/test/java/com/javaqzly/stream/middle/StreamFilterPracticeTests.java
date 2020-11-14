package com.javaqzly.stream.middle;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StreamFilterPracticeTests {

	@Test
	void contextLoads() {
	}

	/**
	 * filter属于中间操作、主要用来通过谓词进行过滤
	 */
	@Test
	public void testFilter() {
		Stream<String> oneStream = Stream.of("I", "like", "reading", "I", "like", "reading", "English", "book", "very",
				"much");
		oneStream.filter(item->item.matches(".*i.*")).forEach(System.out::println);

	}
}
