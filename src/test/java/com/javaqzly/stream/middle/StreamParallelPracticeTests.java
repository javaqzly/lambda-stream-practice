package com.javaqzly.stream.middle;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StreamParallelPracticeTests {

	@Test
	void contextLoads() {
	}

	/**
	 * parallel属于中间操作、用来对集合中的操作进行并行处理、化整为零、大家看输出结果的随机顺序就可以基本清楚了
	 */
	@Test
	public void testDistinct() {
		Stream<String> oneStream = Stream.of("I", "like", "reading", "I", "like", "reading", "English", "book", "very",
				"much");
		oneStream.parallel().distinct().forEach(System.out::println);

	}
}
