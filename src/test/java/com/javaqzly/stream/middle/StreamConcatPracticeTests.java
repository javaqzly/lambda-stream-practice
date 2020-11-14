package com.javaqzly.stream.middle;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StreamConcatPracticeTests {

	@Test
	void contextLoads() {
	}

	/**
	 * 静态的concat方法主要用来合并两个流、属于中间操作、返回的结果任然是流
	 */
	@Test
	public void testConcat() {
		Stream<String> oneStream = Stream.of("I", "like", "reading");
		Stream<String> twoStream = Stream.of("English", "book", "very", "much");
		Stream<String> threeStream = Stream.concat(oneStream, twoStream);
		threeStream.forEach(System.out::println);

	}
}
