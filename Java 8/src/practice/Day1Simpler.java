package practice;
interface Calculator {
	int calculate(int a,int b);
}
interface Checker {
	boolean check(int n);
}
interface Transformer {
	String transform(String s);
}
interface Printer {
	void print(String s);
}

class Add implements Calculator {
	public int calculate(int a,int b) {
		return a+b;
	}
}
class Sub implements Calculator {
	public int calculate(int a, int b) {
		return a-b;
	}
}


public class Day1Simpler {
	//calculator method
	public static void printCalculation(int a ,int b, Calculator c) {
		System.out.println(c.calculate(a, b));
	}
	// checker method
	public static void printIfTrue(int a,Checker c) {
		if(c.check(a)) {
			System.out.println(a);
		}
	}
	//transformer method
	public static void show(String s , Transformer t) {
		System.out.println(t.transform(s));
	}
	//print method
	public static void run(String s, Printer p) {
		p.print(s);
	}
	
	
	public static void main(String[] args) {
		printCalculation(4, 5, new Add());
		printCalculation(5, 4, new Sub());
		printCalculation(5, 6, new Calculator() {
			public int calculate (int a ,int b) {
				return a+b;
			}
		});
		printCalculation(5, 6, (a,b)->a+b);
		printCalculation(3, 4, new Calculator() {
		    public int calculate(int a, int b) {
		        return a * b;
		    }
		});
		printCalculation(3, 4,(a, b) -> a * b);
		
		//checker
		printIfTrue(100, a -> a>100);
		printIfTrue(200, a -> a%2==0);
		printIfTrue(20, a -> a<0);
		
		//transformer
		show("Aditya", s -> s.toUpperCase());
		show("Aditya", s -> "Mr. "+ s);
		// this method converts character into string
		show("Aditya", s -> String.valueOf(s.charAt(0)));
		// this method prints string s.substring(0,1)
		
		//print
		run("Aditya", s -> System.out.println(s));
		run("Aditya", s -> System.out.println("[" + s + "]"));
		run("Aditya", s -> System.out.println("Aditya has "+s.length()+" characters"));
	}

}
