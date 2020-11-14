package com.javaqzly.lambda.functions;

import java.util.function.Consumer;
import java.util.function.Supplier;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LambdaStreamPracticeApplicationTests {

	@Test
	void contextLoads() {
	}

	
	
	
	
	@Test
	public void test() {
		// 反面教材： hello("good morning!",(item)->System.out::println);
		hello("good morning!", (item) -> System.out.println(item));
	}

	public void hello(String st, Consumer<String> con) {
		con.accept(st);
	}
	
	@Test
	public void testSupplier() {
		String content = helloSupplier(()->"good boy!");
		System.out.println(content);
	}

	public String helloSupplier(Supplier<String> supplier) {
		return supplier.get();
	}

}
