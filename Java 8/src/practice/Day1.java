package practice;
interface Operation {
	int apply(int a,int b);
}


class Add implements Operation {
	@Override
	public int apply(int a, int b) {
		return a+b;
	}
}

class Multiply implements Operation{
	@Override
	public int apply(int a,int b) {
		return a * b;
	}
}



public class Day1 {
	public static void printResult(int a, int b , Operation op) {
		System.out.println(op.apply(a, b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printResult(3, 4, new Add());
		printResult(3, 4, new Operation() {
			public int apply(int a,int b) {
				return a+b;
			}
		});
		printResult(3, 4, (a,b) -> a+b);
		printResult(3, 4, (a,b)-> a*b);
		printResult(4, 5, (a,b) -> a-b);
		
		}
}



