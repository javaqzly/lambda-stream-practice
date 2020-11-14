package com.javaqzly.stream.end;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StreamReducePracticeTests {

	@Test
	void contextLoads() {
	}

	/**
	 * reduce属于规约操作、就是会对流里面的数据进行迭代处理。产生类似递归的效果
	 */
	@Test
	public void testForNoneMatch() {
		Stream<Integer> oneStream = Arrays.stream(new Integer[] { 12, 33, 44, 55, 23, 333, 77, 99 });
	    Integer heZhi = oneStream.reduce(0,(a,b)->a+b);
	    System.out.println(heZhi);
	    Stream<Integer> twoStream = Arrays.stream(new Integer[] { 12, 33, 44, 55, 23, 333, 77, 99 });
	    System.out.println(twoStream.mapToInt(item->item).sum());
	    System.out.println("game over!");
	}
}
