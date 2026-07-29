package flow_of_program;
//finishing normal pairs
//removing duplicated

public class allpairssum {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		for(int i=0;i<arr.length-1;i++) {
			int num1=arr[i];
			for(int j=i+1;j<arr.length;j++) {
				int num2=arr[j];
				System.out.println(num1+num2);
				if(j==arr.length-1) {
					
				}
			}
		}

	}

}
