package practice;
//printer is renamed as consumer 
import java.util.function.Consumer;
//method name is accept 

//method name is get
// next method is supplier which takes nothing and gives back something 
import java.util.function.Supplier;

public class Day2B {
	public static void consume(String a , Consumer<String> c) {
		c.accept(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 consume("Aditya", s -> System.out.println(s));
	 
	 //somedirect methods to call 
	 Consumer<String> c = s -> System.out.println(s);
	 
	 Supplier<String> s1 = () -> "Hello";
	 System.out.println(s1.get()); 
	 Supplier<Double> s2 = () -> Math.random();
	 System.out.println(s2.get());
	 //Supplier<List<String>> s3 = () -> new ArrayList<>();
	 c.accept("sharen");
//	 Predicate<Integer> p = n -> n > 100;
//	 boolean result = p.test(150);          // catch the answer
//
//	 Function<String, Integer> f = s -> s.length();
//	 int len = f.apply("Aditya");           // catch the answer
//
//	 Consumer<String> c = s -> System.out.println(s);
//	 c.accept("Aditya");                    // nothing to catch
	}

}
