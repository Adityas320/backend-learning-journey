package flow_of_program;

public class Practice {
	public static void main(String args[]) {
		String str="abcdabc";
		char temp=0;
		int j;
		//boolean b1[]=new boolean[str.length()];
		for(int i=0;i<str.length();i++) {
			char first=str.charAt(i);
			for( j=0;j<str.length();j++) {
				if(i==j) {
					continue;
				}
				else if(first==str.charAt(j)) {
					continue;
				}
				}
			if(j==str.length()) {
				temp=str.charAt(i);
				break;
			}
		}
		System.out.println(temp);
	}
}
