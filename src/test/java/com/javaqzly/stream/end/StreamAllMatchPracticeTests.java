package com.javaqzly.stream.end;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StreamAllMatchPracticeTests {

	@Test
	void contextLoads() {
	}

	/**
	 *testAllMatch属于结束操作符号、如果流里面所有的数据都满足对应的条件。则返回真
	 */
	@Test
	public void testAllMatch() {
	    Stream<Integer> oneStream = Arrays.stream(new Integer[] {12,33,44,55,23,333,77,99});
	    System.out.println(oneStream.allMatch(item-> item.intValue()>33));
	    
	}
}
