package collections;

import java.util.*;

public class cla1 {

	public static void main(String[] args) {
		Map<String ,Integer> tally = new HashMap<>();
		// TODO Auto-generated method stub
		String[] votes = {"A", "B" , "C" , "A","A","B"};
		boolean[] brr = new boolean[votes.length];
		for(int i=0;i<votes.length-1;i++) {
			int count =1;
			if(brr[i]==false) {
			for(int j=i+1;j<votes.length;j++) {
				if(votes[i]==votes[j]) {
					brr[j]=true;
					count++;
				}
			}
			tally.put(votes[i], count);
			}
		}
		System.out.println(tally);
	}

}
