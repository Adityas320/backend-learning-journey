package Exception;
class methods {
	public void methodC() {
		System.out.println("in method c");
		String s = null;
		System.out.println(s.length());

	}
	public void methodB(){
		System.out.println("in methodb");
		methodC();
	}
	public void methodA() {
		System.out.println("in method a");
		methodB();
	}
}

public class main1 {

	public static void main(String[] args) {
		methods m1=new methods();
		try{
			m1.methodA();
		} catch(NullPointerException e) {
			System.out.println("exception handled in main");
		}
		System.out.println("program continues");
		}
		
	}


