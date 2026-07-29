package functions;
import java.util.*;
//Write a program to print the factorial of a number by defining 
//a method named 'Factorial'. Factorial of any number n is represented 
//by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n

public class assignment3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number to be factorial");
		int a=sc.nextInt();
		int factorial=1;
		for(int i=1;i<=a;i++) {
			if(i<a) {
			System.out.print(i+"*");
			}
			else {
				System.out.print(i+"= ");
			}
			factorial=factorial*i;
		}
		System.out.print(factorial);
		sc.close();
	}

}
