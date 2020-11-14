package com.javaqzly.stream.middle;

import java.util.Random;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StreamPeakPracticeTests {

	@Test
	void contextLoads() {
	}

	/**
	 *  peek属于中间操作、主要目的是用来对流中的数据进行加工、并不会改变流中的数据类型
	 */
	@Test
	public void testPeak() {
		Stream.generate(()->{
			Random r=new Random();
			Person p=new Person();
			p.setAge(r.nextInt(100));
			p.setName("person"+r.nextInt(100));
			return p;
		}).limit(10).peek(item->item.setAge(18)).map(item->item.getName()+"--->"+item.getAge()).forEach(System.out::println);
	}

	private static class Person {
		private int age;

		private String name;

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}
}
