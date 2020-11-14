package com.javaqzly.stream.middle;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StreamUnOrderedPracticeTests {

	@Test
	void contextLoads() {
	}

	/**
	 * UnOrdered属于中间操作、用于去掉有序的约束条件、只是去掉约束条件！不是用来生成随机乱序序列的。比如skip和limit这些的有隐性约束条件的可以被打破
	 */
	@Test
	public void testUnOrdered() {
		for (int i = 0; i < 100; i++) {
			innerUnOrdered();
		}
	}

	private void innerUnOrdered() {
		Stream<String> oneStream = Stream.of("I", "like", "reading", "I", "like", "reading", "English", "book", "very",
				"much");
		oneStream.unordered().parallel().distinct().skip(1).limit(2).findFirst().ifPresent(System.out::println);
	}
}
