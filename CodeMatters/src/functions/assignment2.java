package functions;
import java.util.*;
//Define a program to find out whether a given number is even or odd.
class method {
	public Boolean Cheak(int a) {
		if(a%2==0) {
			return true;
		}
		else {
			return false;
		}
	}
}
public class assignment2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number to cheak if it is even or not");
		int a=sc.nextInt();
		method m1=new method();
		System.out.println(m1.Cheak(a));
		sc.close();
	}

}
