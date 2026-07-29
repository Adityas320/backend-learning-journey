package flow_of_program;
//find occurance of character
public class occurance {

	public static void main(String[] args) {
		String str="abcdabc";
		int count;
		char temp=0;
		int j;
		boolean b1[]=new boolean[str.length()];
		for(int i=0;i<str.length()-1;i++) {
			count=1;
			char first=str.charAt(i);
			if(b1[i+1]==false) {
			for( j=i+1;j<str.length();j++) {
				if(first==str.charAt(j)) {
					count++;
					b1[j]=true;
				}
				}
			System.out.println("the char "+str.charAt(i)+"occurs "+count+"times");
			}
			
		}
		System.out.println(temp);

	}

}
