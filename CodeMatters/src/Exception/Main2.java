package Exception;

import java.io.FileReader;
import java.io.IOException;

public class Main2 {
	static void methodC() throws IOException {
		FileReader fr = new FileReader("test.txt");

	}
	static void methodB() throws IOException{
		methodC();
	}
	static void methodA() throws IOException{
		methodB();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			methodA();
		} catch(IOException e){
			System.out.println("handled in main");
		}
		}
	}


