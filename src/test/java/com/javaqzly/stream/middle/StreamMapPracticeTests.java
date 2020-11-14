package com.javaqzly.stream.middle;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StreamMapPracticeTests {

	@Test
	void contextLoads() {
	}
 
	/**
	 * limit也属于中间操作、这个函数比较容易理解、就是对流进行截断。取前面的固定几项
	 */
	@Test
	public void testMap() {
		Arrays.stream(new String[] { "java", ".net", "C++", "python", "javascript" }).map(item->item.length()).forEach(System.out::println); 
		
	}
}
