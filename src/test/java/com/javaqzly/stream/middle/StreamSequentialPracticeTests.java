package com.javaqzly.stream.middle;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StreamSequentialPracticeTests {

	@Test
	void contextLoads() {
	}

	/**
	 * parallel属于中间操作、用来对集合中的操作进行串行处理、也就是只用单核处理的能力。比如某些无限集合不适合高效进行fork join的可以考虑串行 
	 */
	@Test
	public void testSequential() {
		Stream<String> oneStream = Stream.of("I", "like", "reading", "I", "like", "reading", "English", "book", "very",
				"much");
		oneStream.parallel().sequential().distinct().forEach(System.out::println);

	}
}
