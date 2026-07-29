package Java_Basic;
import java.util.Scanner;
public class LCM {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number :");
		int num1=sc.nextInt();
		System.out.println("enter second number");
		int num2=sc.nextInt();
		int a=num1,b=num2,lcm=1,i=2;
		while(a>1||b>1) 
		{
			int c=1,d=1;
			if(a%i==0) 
			{
				c=i;
				a=a/i;
			}
			if(b%i==0) 
			{
				d=i;
				b=b/i;
			}
			if(c==d) 
			{
				lcm=lcm*c;
			}
			else {
				lcm=lcm*c*d;
			}
			i++;
		}
		System.out.println(lcm);
	}

}
