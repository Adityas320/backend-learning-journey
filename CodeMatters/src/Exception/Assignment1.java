package Exception;
import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  a,b,c;
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter the first number");
		a=sc.nextInt();
		System.out.println("enter the second number");
		b=sc.nextInt();
		try{
			System.out.println(c=a/b);
		}catch(ArithmeticException e) {
			System.out.println("Number cannot be divided by zero");
		}
		sc.close();
		}
	}

