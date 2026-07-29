package conditional_loops;
import java.util.Scanner;
public class commision_percentage {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the amount");
		int amount=sc.nextInt();
		System.out.println("Enter the commision");
		int commision=sc.nextInt();
		float commision_percent=(100*(float)commision)/amount;
		System.out.println(commision_percent+"% is your commision");
		sc.close();
	}

}
