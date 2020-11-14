package com.javaqzly.lambda.syntax;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LambdaSyntaxPracticeTests {

	@Test
	public void testLambdaSyntaxPartOne() {
		Runnable r = () -> System.out.println("hello lambda");
		new Thread(r).start();
	}

	@Test
	public void testLambdaSyntaxPartTwo() {
		Consumer<String> con = (x) -> System.out.println(x);
		con.accept("everything will be better!");

	}

	@Test
	public void testLambdaSyntaxPartThree() {
		Consumer<String> con = x -> System.out.println(x);
		con.accept("everything will be better and better!");

	}

	@Test
	public void testLambdaSyntaxPartFour() {
		Comparator<Integer> com = (x, y) -> {
			System.out.println("函数式接口");
			return Integer.compare(x, y);
		};

		System.out.println(com.compare(1, 2));
	}

	@Test
	public void testLambdaSyntaxPartFile() {
		Comparator<Integer> com = (x, y) -> Integer.compare(x, y);
		System.out.println(com.compare(1, 1));
	}

	@SuppressWarnings("unused")
	@Test
	public void testLambdaSyntaxPartSix() {
		Comparator<Integer> com = (Integer x, Integer y) -> { // Integer 类型可以省略
			System.out.println("函数式接口");
			return Integer.compare(x, y);
		};

		BinaryOperator<Long> add = (Long x, Long y) -> x + y;// 4

		BinaryOperator<Long> addImplicit = (x, y) -> x + y;// 5 类型推断

	}

}
