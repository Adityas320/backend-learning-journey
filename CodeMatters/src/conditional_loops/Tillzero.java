package conditional_loops;
import java.util.Scanner;

public abstract class Tillzero {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int largest=n;
		while( n!=0) {
			System.out.println("enter the number");
			n=sc.nextInt();
			if(n>largest) {
				largest=n;
			}
		}
		System.out.println(largest);
		sc.close();
	}

}
