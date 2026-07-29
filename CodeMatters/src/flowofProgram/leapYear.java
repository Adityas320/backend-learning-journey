package flowofProgram;
import java.util.Scanner;
public class leapYear {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int year=input.nextInt();
		if(year%100==0) {
			if(year%4==0) {
				System.out.println("it is a leap year");
				return;
			}
			else {
				System.out.println("it is not a leap year");
			}
		}
		if(year%4==0) {
			System.out.println("it is a leap year");
		}
	}

}
