package Exception;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int [] numbers= {1,2,3};	
	System.out.println("what index do you want");
	Scanner sc=new Scanner(System.in);
	try {
		int a=sc.nextInt();
		System.out.println(numbers[a]);
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("index is out of bound");
	}
	catch(InputMismatchException e) {
		System.out.println("enter valid number");
	}
	}
}
