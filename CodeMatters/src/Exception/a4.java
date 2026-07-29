package Exception;

import java.io.IOException;

class InsufficientBalanceException extends RuntimeException {
	double amount;
	public InsufficientBalanceException(String message,double amount) 
		// TODO Auto-generated constructor stub
	 {
		super(message);
		this.amount=amount;
		
	}
	public double getammount() {
		return amount;
	}
	
} 

public class a4 {
	static void methodc() throws IOException{
		throw new IOException();
	}
	static void methodb() throws IOException{
		methodc();
	}
	static void methoda()  {
		try {
			methodb();
		} catch(IOException e) {
			System.out.println("Caught");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
