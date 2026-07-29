package FirstJava;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num1=sc.nextInt();
		int num2=num1;
		int num3=num1;
		int count=0;
		int fina=1;
		while(num2>0) {
			int result=num2 % 10;
			count++;
			num2=num2/10;
		}
		while(num3>0) {
			int result=num2%10;
			int n=result;
			for(int i=0;i<count;i++) {
				n=result*
			}
		}
	}

}
