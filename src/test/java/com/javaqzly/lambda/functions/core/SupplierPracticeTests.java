package com.javaqzly.lambda.functions.core;

import java.util.Random;
import java.util.function.Supplier;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SupplierPracticeTests {

	@Test
	void contextLoads() {
	}
	

	@Test
	public void testSupplier() {
		Supplier<Integer> randomIntSupplier = () -> {
			Random r = new Random();
			int num = r.nextInt(100);
			return num;
		};
		printRandomInt(randomIntSupplier);
	}

	private void printRandomInt(Supplier<Integer> supplier) {
		int randomInt = supplier.get();
		System.out.println(randomInt);
	}

}
