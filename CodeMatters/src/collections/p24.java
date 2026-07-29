package collections;
import java.util.*;

public class p24 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);		
		for(int i=list.size()-1;i>=0;i--) {
			System.out.println(list.get(i));
}
	}
	
	
}
