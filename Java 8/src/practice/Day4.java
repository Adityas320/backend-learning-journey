package practice;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Day4 {

	public static void main(String[] args) {
		Consumer<String> print = System.out::println;
		Function<String,Integer> length = String::length;
		Function<String,String> trim = String::trim;
		Predicate<String> empty = String::isEmpty ;
		Function<String,Integer> parse = Integer::parseInt;
		Supplier<ArrayList<String>> newobject= ArrayList::new;
		print.accept("hello");
		System.out.println(length.apply("hello"));
		System.out.println(trim.apply("llo"));
		System.out.println(empty.test(""));
		System.out.println(parse.apply("1445"));
		

	}

}
