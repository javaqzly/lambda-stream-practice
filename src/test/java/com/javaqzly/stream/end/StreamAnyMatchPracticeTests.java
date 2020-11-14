package com.javaqzly.stream.end;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StreamAnyMatchPracticeTests {

	@Test
	void contextLoads() {
	}

	/**
	 *testAnyMatch属于结束操作符号、如果流里面所有的数据有一个满足对应的条件。则返回真
	 */
	@Test
	public void testAnyMatch() {
	    Stream<Integer> oneStream = Arrays.stream(new Integer[] {12,33,44,55,23,333,77,99});
	    System.out.println( oneStream.count());
	    //System.out.println(oneStream.anyMatch(item-> item.intValue()>1000));
	    
	}
}
