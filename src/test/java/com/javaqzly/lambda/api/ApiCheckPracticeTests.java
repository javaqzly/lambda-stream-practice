package com.javaqzly.lambda.api;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ApiCheckPracticeTests {
   
	@Test
	public void testSayHelloLambda() {
		this.sayHelloLambda(()->System.out.println("hello lambda!"));
	}
	
	private void sayHelloLambda(SayHelloLambda worker) {
		  worker.sayHelloLambda();
	}
}
