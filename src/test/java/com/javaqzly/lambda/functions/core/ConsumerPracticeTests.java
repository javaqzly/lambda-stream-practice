package com.javaqzly.lambda.functions.core;

import java.util.Arrays;
import java.util.function.Consumer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ConsumerPracticeTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void test() {
		 //反面教材：
		 //hello("good morning!",(item)->System.out::println);
		//hello("good morning!", (item) -> System.out.println(item));
	}

	public void hello(String st, Consumer<String> con) {
		con.accept(st);
	}

	/**
	 * 对consumer进行组合、从而达到一个目的就是对集合中的每条消息，用多个处理器进行处理。各种逻辑操作通过不同的consumer来进行隔离
	 */
	@Test
	public void testAndThen() {
		 String[] array= {"小李飞刀,古龙,李寻欢","天龙八部,金庸,乔峰","笑傲江湖,金庸,令狐冲"};
		 Consumer<String> worksConsumer=(line)->{
			  String name = line.split(",")[0]; 
			  System.out.println("作品名称："+name);
		 };
		 Consumer<String>  authorConsumer=(line)->{
			  String author = line.split(",")[1];
			  System.out.println("作者："+author);
		 };
		 Consumer<String> roleConsumer=(line)->{
			 String role=line.split(",")[2];
			 System.out.println("主角："+role); 
			 System.out.println();
		 };
		 Arrays.stream(array).forEach(item->worksConsumer.andThen(authorConsumer).andThen(roleConsumer).accept(item));
//		 for(String item:array) {
//			 worksConsumer.andThen(authorConsumer).andThen(roleConsumer).accept(item);
//		 }
	}
    /**
     * 增强了代码的可读性和简洁性,演示了使用lambda表达式情况下的consumer接口在多线程场景的一个应用的用法
     */
	@Test
	public void testConsumer() {
		new Thread(() -> doSomeBusiness()).start();
	}

	private void doSomeBusiness() {
		System.out.println("It will take long time!");
	}

}
