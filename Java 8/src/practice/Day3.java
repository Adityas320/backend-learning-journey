package practice;
import java.util.function.Predicate;
import java.util.function.Function;


public class Day3 {

	public static void main(String[] args) {
		Predicate<Integer> positive = c -> c>0;
		Predicate<Integer> even = c -> c%2==0;
		Predicate<Integer> big = c -> c>100;
		
		Predicate<Integer> pe = positive.and(even);
		Predicate<Integer> pb = positive.or(big);
		Predicate<Integer> ne = even.negate();
		Predicate<Integer> pbe = positive.and(big).and(even);
		Predicate<Integer> bne = big.and(even.negate());
		
		Function<String, String> trim = s -> s.trim();
		Function<String, String> upper = s -> s.toUpperCase();
		Function<String,String> exclaim = s-> s+" !";
		
		Function<String, String> trimThenUpp = trim.andThen(upper);
		Function<String,String> upperThenExclaim = upper.andThen(exclaim);
		Function<String, String> trimUpperExclaim = trim.andThen(upper).andThen(exclaim);
		Function<String, String> uppthentrim = trim.compose(upper);
		
		System.out.println("trim then upper ["+trimThenUpp.apply(" aditya ") + "]");
		System.out.println("upper then exclaim ["+upperThenExclaim.apply(" aditya ") + "]");
		System.out.println("trim then upper then exclaim ["+trimUpperExclaim.apply(" aditya ") + "]");
		System.out.println("upper then trim ["+uppthentrim.apply(" aditya ") + "]");
		
		System.out.println(positive.test(20));
		System.out.println(even.test(20));
		System.out.println(big.test(20));
		
		System.out.println(pe.test(20));
		System.out.println(pe.test(13));
		System.out.println(pe.test(-20));
		
		System.out.println(pb.test(20));
		System.out.println(pb.test(-150));
		
		System.out.println(ne.test(20));
		System.out.println(ne.test(13));
		
		System.out.println(pbe.test(20));
		System.out.println(pbe.test(150));
		
		System.out.println(bne.test(150));
		System.out.println(big.test(133));

	}

}
