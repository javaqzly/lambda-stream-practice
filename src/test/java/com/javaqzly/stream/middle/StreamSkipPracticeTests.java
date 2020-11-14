package com.javaqzly.stream.middle;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StreamSkipPracticeTests {

	@Test
	void contextLoads() {
	}
 
	/**
	 * skip也属于中间操作、这个函数比较容易理解、就是对流进行跳过。跳过前面的固定几项
	 */
	@Test
	public void testLimit() {
		Arrays.stream(new String[] { "java", ".net", "C++", "python", "javascript" }).skip(3)
				.forEach(System.out::println);
		
	}
}
