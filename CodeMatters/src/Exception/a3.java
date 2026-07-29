package Exception;

import java.io.IOException;

public class a3 {
	public static void openFile(String name) throws IOException {
		throw new IOException("cannot open " + name);
	}
	public static void validate(int marks) {
		if(marks<0||marks>100) {
			throw new RuntimeException("Invalid marks");
		}
		System.out.println("valid");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			openFile("input");
		} catch(IOException e) {
			System.out.println("caught");
		}
		try {
			validate(-2);
		} catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}

}
