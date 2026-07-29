package functions;

import java.util.*;
//Define two methods to print the maximum and the minimum number
//respectively among three numbers entered by the user.

public class assignment1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter second number");
		int b=sc.nextInt();
		System.out.println("enter third number");
		int c=sc.nextInt();
		System.out.println("minimum value is "+minimum(a,b,c));
		System.out.println("maximum value is "+maximum(a,b,c));
		sc.close();

	}
	static int minimum(int a,int b,int c) {
		if(a<b) {
			if(a<c) {
				return a;
			}
			else {
				return c;
			}
		}
		else if(b<c) {
			return b;
		}
		else {
			return c;
		}
	}

	static int maximum(int a,int b,int c) {
		if(a>b) {
			if(a>c) {
				return a;
			}
			else {
				return c;
				}
		}
		else if(b>c) {
			return b;
		}
		else {
			return c;
		}
		}
}
