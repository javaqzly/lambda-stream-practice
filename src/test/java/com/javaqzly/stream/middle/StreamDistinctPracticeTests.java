package com.javaqzly.stream.middle;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StreamDistinctPracticeTests {

	@Test
	void contextLoads() {
	}

	/**
	 * distinct属于中间操作、主要用来去重
	 */
	@Test
	public void testDistinct() {
		Stream<String> oneStream = Stream.of("I", "like", "reading", "I", "like", "reading", "English", "book", "very",
				"much");
		oneStream.distinct().forEach(System.out::println);

	}
}
