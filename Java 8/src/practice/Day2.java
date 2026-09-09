package practice;
//predicate becomes checker method from day 1 predicate is the name
import java.util.function.Predicate;
//function becomes the method replacement for transformer 
import java.util.function.Function;

public class Day2 {

	public static void printIfTrue(int a , Predicate<Integer> p) {
		//the method name in this interface is test
		if(p.test(a)) {
			System.out.println(a);
		}
	}
	//withlambda we cannot have a overloading method
//	public static void show(String s , Function<String, String> f) {
//		//the method name is apply here 
//		System.out.println(f.apply(s));
//	}
	// we can have a general form of this method
	//The <T, R> before void says: this method has two placeholder types, decided at each call.
	public static  <T,R> void show(T input,Function<T, R> f) {
		System.out.println(f.apply(input));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printIfTrue(150, a -> a>100);
		printIfTrue(200, a -> a % 2==0);
		
		
		show("Aditya", s -> s.toUpperCase());
		show("Aditya", s -> s.length());
	}

}
