package collections;
import java.util.*;
//Simulate registration:
//Add usernames
//Reject duplicates
//Print all users

public class p32 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Set<String> list=new HashSet<> ();
		for(int i=0;i<5;i++) {
			System.out.println("enter your username");
			list.add(sc.nextLine());
		}
		System.out.println(list);
	}

}
