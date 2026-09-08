//package practice;
//interface Operation {
//	int apply(int a,int b);
//}
//interface Checker {
//	boolean check (int n);
//}
//interface Transformer {
//	String transform(String s);
//}
//
//class Add implements Operation {
//	@Override
//	public int apply(int a, int b) {
//		return a+b;
//	}
//}
//
//class Multiply implements Operation{
//	@Override
//	public int apply(int a,int b) {
//		return a * b;
//	}
//}
//
//class Greater implements Checker {
//	@Override 
//    public boolean check(int n) {
//		if(n>100) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
//}
//
//public class Day1 {
//	public static void printResult(int a, int b , Operation op) {
//		System.out.println(op.apply(a, b));
//	}
//	public static void printIfTrue(int n , Checker c) {
//		if(c.check(n)) {
//			System.out.println(n);
//		}
//	}
//	public static void show(String s, Transformer t) {
//		s.toUpperCase();
//		String reversed = "";
//		for(int i= s.length()-1;i>=0;i--) {
//			reversed += s.charAt(i);
//		}
//		System.out.println("Mr. " + s);
//		
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		printResult(3, 4, new Add());
//		printResult(3, 4, new Operation() {
//			public int apply(int a,int b) {
//				return a+b;
//			}
//		});
//		printResult(3, 4, (a,b) -> a+b);
//		printResult(3, 4, (a,b)-> a*b);
//		printResult(4, 5, (a,b) -> a-b);
//		
//		
//		printIfTrue(4, n -> n % 2 == 0);
//		printIfTrue(23, n -> n > 100);
//		printIfTrue(-2, n -> n < 0);
//		
//		
//		}
//}
//
//
//
