package Exception;
class exception {
	public int test() {
		System.out.println("hello");
		return 0;
	}
}

	public class Assignment3 {
	public static int  main(String[] args) {
		
		exception e= new exception();
		try {
			int n=e.test();
		}catch(ArithmeticException d) {
			System.out.println("normal exception");
			return 10;
		}
		finally {
			System.out.println("it is finally");
			return 12;
		}
		
		
	}

}
