package collections;

import java.util.*;

public class p22 {

	public static void main(String[] args) {
		int add=0,max=0;
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		
		for(Integer i:list) {
			if(i>max) {
				max=i;
			}
			add=add+i;
			if(i%2!=0) {
				list.remove(i);
			}
		}
		System.out.println(add);
		System.out.println(max);
		System.out.println(list);
	}

}
