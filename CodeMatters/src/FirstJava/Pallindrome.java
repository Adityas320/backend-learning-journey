package FirstJava;

public class Pallindrome {

	public static void main(String[] args) {
		String name="aditya";
		int count=0;
		int n=name.length();
		for(int i=0,j=n;i<0;i++,j--) {
			if(i!=j&&i<j) {
			 if(name.charAt(i)==name.charAt(j)) {
				 count++;
			 }
			 else {
				 System.out.println("no");
				 break;
			 }
			}
			else {
				System.out.println("it is a pallindrome");
				break;
			}
			}
		}

	}


