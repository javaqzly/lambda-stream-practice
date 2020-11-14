package com.javaqzly.stream.middle;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StreamFlatMapPracticeTests {

	@Test
	void contextLoads() {
	}

	/**
	 * FlatMap主要用来完成扁平化的应用。这种效果是没有办法通过map来实现的。因为flatMap的实现上把Stream对象扁平化处理了。
	 * 扁平化的作用能把流中传递的集合或数组转化成单个元素在流中传递
	 * 可以比喻为一个管道里面水平运输水桶。开始是一次运10桶水、流水线上每个环节都需要单次处理十桶水、如果流水线上面每个工种都能处理好10桶水、那么问题不大，
	 * 关键在于流水线上面很多工种只能一次处理一桶水。这样就需要flatMap来做扁平化的处理。通过flatMap适配以后、流水线上又变成了。一次处理一桶水。
	 */
	@Test
	public void testFlatMap() {
//		Stream<String> oneStream = Stream.of("I", "like", "reading", "I", "like", "reading", "English", "book", "very",
//				"much");
//		 oneStream.map(item->item.split("")).flatMap(item->Stream.of(item)).forEach(System.out::println);
		 
		 String[] names= {"段誉,乔峰,虚竹","令狐冲,左冷禅,岳不群","杨过,郭芙,金轮法王"};
		 
		 Arrays.stream(names).map(item->item.split(",")).flatMap(Stream::of).forEach(System.out::println);

		 
		 
		 //找出所有未成年的年纪，并在控制台打印出来。
//		 String[] ages= {"12,33,55","66,77,99","13,55,100","77,66,55","23,17,15"};
//		 Stream<Object> flatMap = Arrays.stream(ages).map(item->item.split(",")).flatMap(Arrays::stream);//.map(item->Integer.parseInt(item)).filter(item->item.intValue()<18).forEach(System.out::println);
//		 flatMap.forEach(item->{
//			 System.out.println(item.getClass().getName());
//		 });
//		 
		 
	}
}
