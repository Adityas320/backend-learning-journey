package Exception;
import java.util.Scanner;
class invalidAge extends RuntimeException {
	public invalidAge(String message) {
		super(message);
	}
}


public class Assignment4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a age");
		try {
			int a=sc.nextInt();
			if(a<18) {
				throw 
			}
		}catch(invalidAge e) {
			System.out.println("");
		}
	}

}
