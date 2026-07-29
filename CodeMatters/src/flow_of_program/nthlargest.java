package flow_of_program;

public class nthlargest {
	public static void main(String args[]) {
		int arr[]= {12,13,14,15,16,17};
		int largest=0;
		int max=1;
		int n=2;
		while(n>1) {
			if(max>largest) {
			for(int i=0;i<arr.length;i++) {
				if(max>=largest) {
					continue;
				}
			else if(arr[i]>largest) {
					largest=arr[i];
					}
				}
			max=largest;
			n--;
			}
			}
	}
}

