package flow_of_program;
//longest word in a sequence 
public class practice2 {

	public static void main(String[] args) {
		String str="hello my name is aditya choubey";
		int finalCount=0;
		int count=0;
		String word="",finalword="";
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)==' ') {
				count =0;
				word="";
				continue;
			}
			else {
			count++;
			word=word+str.charAt(i);
			}
			if(finalCount<count) {
				finalCount=count;
				if(finalword.length()<word.length()) {
					finalword=word;
				}
			}
				
		}
		System.out.println(finalCount);
		System.out.println(finalword);
		}

	}


