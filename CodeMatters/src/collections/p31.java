package collections;
import java.util.*;
//Input: List of integers
//Output: Unique values using Set

public class p31 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		Scanner sc= new Scanner(System.in);
		for(int i=1;i<=5;i++) {
			System.out.println("enter "+i);
			list.add(sc.nextInt());
		}
		Set<Integer> improvedlist=new HashSet<> (list);
		System.out.println(improvedlist);
		sc.close();
	}

}
