package conditional_loops;
import java.util.*;

public class factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				list.add(i);
			}
		}
		System.out.println(list);
		sc.close();
	}

}
