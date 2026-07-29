package conditional_loops;
import java.util.Scanner;
public class product_sum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int test=n,product=1,sum=0;
		while(test>0) {
			product=product*(test%10);
			sum=sum+(test%10);
			test=test/10;
		}
		System.out.println(product);
		System.out.println(sum);
		System.out.println(product-sum);
		sc.close();
	}
}
