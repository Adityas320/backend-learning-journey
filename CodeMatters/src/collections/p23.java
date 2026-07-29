package collections;

import java.util.*;

public class p23 {

	public static void main(String[] args) {
		String city;
		List<String> list=new ArrayList<>();
		list.add("vidisha");
		list.add("bhopal");
		list.add("ujjain");
		list.add("gwaliar");
		list.add("indore");
		list.add("ranchi");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a city");
		city=sc.next();
		if(list.contains(city)) {
			System.out.println(list.indexOf(city)+" it contains");
		}
		else {
			System.out.println("it does not contain");
		}
		sc.close();
	}

}
