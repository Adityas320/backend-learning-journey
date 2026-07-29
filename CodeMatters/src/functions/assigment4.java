package functions;

import java.util.*;

public class assigment4 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number to cheak for pallindrome");
		int a=sc.nextInt();
		System.out.println(cheak(a));

	}
	static Boolean cheak(int a) {
int b=a;
int c=0;
while(b>0 &&c!=a) {
c=(c+(b%10))*10;

b=b/10;
}
System.out.println(a);
System.out.println(c);
if(a==c) {
	return true;
}
else {
	return false;
}
}

}
