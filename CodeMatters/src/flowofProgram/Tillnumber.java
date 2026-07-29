package flowofProgram;
import java.util.Scanner;
public class Tillnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=10;
		int sum=0;
		System.out.print("Enter the number :");
		int a=sc.nextInt();
		while(a!=n) {
			sum=sum+a;
			System.out.print("number does not match please re enter :");
			a=sc.nextInt();
		}
		if(a==n) {
			sum=sum+a;
			System.out.println("yes it is the number :) and the sum till now is :"+sum);
		}
	}

}
