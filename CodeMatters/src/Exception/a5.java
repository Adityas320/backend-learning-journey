package Exception;

public class a5 {
	public static int divide(int a,int b) {
		return a/b;
	}

	public static void  main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			divide(5, 0);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("done");
			
		}
	}

}
