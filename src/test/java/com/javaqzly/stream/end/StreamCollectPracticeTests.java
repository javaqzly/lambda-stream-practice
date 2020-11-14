package com.javaqzly.stream.end;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SuppressWarnings("unused")
@SpringBootTest
class StreamCollectPracticeTests {

	@Test
	void contextLoads() {
	}

	/**
	 * testAllMatch属于结束操作符号、如果流里面所有的数据都满足对应的条件。则返回真
	 */
	@Test
	public void testCollect() {
		//testMultiCal();
		testMultiGroupBy();
		 //testGroupBy();
		// testToList();
		// testToMap();
//		 testToSet();
	}

	/**
	 * 用来测试各类运算：比如最大值、最小值、求和、求平均值、就流的count等常见聚合运算
	 */
	private void testMultiCal() {
		int[] nums = new int[] { 7, 9, 11, 13, 1, 2, 55, 44, 33, 99, 123 };
		System.out.println(Arrays.stream(nums).getClass().getName());
		System.out.println("求和==》" + Arrays.stream(nums).sum());
		System.out.println("平均值==》" + Arrays.stream(nums).average().orElse(0));
		System.out.println("最大值==》" + Arrays.stream(nums).max().orElse(0));
		System.out.println("最小值==》" + Arrays.stream(nums).min().orElse(0));
		System.out.println("元素的个数==>" + Arrays.stream(nums).count());
		//验证intStream到Stream的一个转化、基本类型到对象类型的转化
		System.out.println(Arrays.stream(nums).mapToObj(item->item+"").collect(Collectors.averagingDouble(Double::valueOf)));
		//验证对象流到基本流的转化
		System.out.println(Arrays.stream(nums).mapToObj(item->item+"").mapToInt(Integer::parseInt).sum());
		
	}

	private void testGroupBy() {
	  Map<Integer, List<Person>> map = Stream.generate(() -> {
			Random r = new Random();
			Person p = new Person();
			p.setAge(r.nextInt(100));
			p.setName("person" + r.nextInt(100));
			return p;
		}).limit(200).sorted(Comparator.comparing(Person::getAge)).collect(Collectors.groupingBy(Person::getAge
				));
//		map.forEach((k, v) -> {
//			System.out.println(k + "==>" + v);
//		});
		map.forEach((k,v)->{
			System.out.println(k+"-->"+v.stream().map(item->item.getAge()+","+item.getName()).collect(Collectors.joining("|","{","}")));
		});
	}

	/**
	 * 测试多级group by的情况
	 */
	@SuppressWarnings("unused")
	private void testMultiGroupBy() {
		String[] cities = new String[] { "北京", "上海", "广州", "深圳", "南京" };
		String[] jobs = new String[] { "程序员", "设计师", "产品经理", "运维工程师", "项目经理" };
		Random r = new Random();
		Supplier<String> citySupplier = () -> {
			return cities[r.nextInt(5)];
		};
		Supplier<String> jobSupplier = () -> {
			return jobs[r.nextInt(5)];
		};
		Map<String, Map<String, List<Person>>> map = Stream.generate(() -> {
			Random rr = new Random();
			Person p = new Person();
			p.setAge(rr.nextInt(100));
			p.setName("person" + rr.nextInt(100));
			p.setCity(citySupplier.get());
			p.setJob(jobSupplier.get());
			return p;
		}).limit(200).collect(Collectors.groupingBy(Person::getCity, Collectors.groupingBy(Person::getJob)));

		map.forEach((k, v) -> {
			// System.out.println(k);
//			String valueStr = v.values().stream().flatMap(List::stream).map(item->item.getName()+"-"+item.getCity()+"-"+item.getJob()).collect(Collectors.joining(","));
//			System.out.println("一级的map分类如下:");
//			System.out.println(k+"--->"+valueStr);

//			System.out.println("二级的map分类如下：");
			System.out.println(k);
			v.forEach((k1, v1) -> {
				String value1Str = v1.stream().map(item -> item.getName() + "-" + item.getCity() + "-" + item.getJob())
						.collect(Collectors.joining(","));
				System.out.println(k1 + "--->" + v1.size() + "-->" + value1Str);
			});
			System.out.println();
		});
	}

	private static class Person {
		private int age;

		private String name;

		private String city;

		private String job;

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getJob() {
			return job;
		}

		public void setJob(String job) {
			this.job = job;
		}

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
	

	private void testToList() {
		Stream<Integer> oneStream = Arrays.stream(new Integer[] { 12, 33, 44, 55, 23, 333, 77, 99 });
		List<Integer> list = oneStream.collect(Collectors.toList());
		list.forEach(System.out::println);
	}

	private void testToMap() {
		Stream<String> oneStream = Arrays
				.stream(new String[] { "java", "python", "javascript", "php", "lisp", "go", "pascal", "vb" });
		Map<String, Integer> map = oneStream.collect(Collectors.toMap(Function.identity(), String::length));
		map.forEach((key, value) -> {
			System.out.println(key + "===>" + value);
		});
	}

	private void testToSet() {
		Stream<Integer> oneStream = Arrays.stream(new Integer[] { 12, 33, 44, 55, 23, 333, 77, 99 });
		Set<Integer> set = oneStream.collect(Collectors.toSet());
		set.forEach(System.out::println);
	}
}
