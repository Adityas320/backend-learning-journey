//Write a method divide(int a, int b) that returns a / b,
//but if b is zero, catches the 
//exception and returns -1 instead. Show the method only.
package Exception;
import java.util.Scanner;
class calculator {
	static int divide(int a,int b) {
		try {
		return a/b;
		} catch (ArithmeticException e) {
			return -1;
		}
		}
	public int getElement(int[] arr,int index) {
		try {
			return arr[index];
		}
		catch(ArrayIndexOutOfBoundsException e) {
			return 0;
		}
	}
	
	}

public class a1 {

	public static void main(String[] args) {
		System.out.println(calculator.divide(5, 0));
		calculator c= new calculator();
		int arr[]= {1,2,3};
		System.out.println(c.getElement(arr, 5));
	}
	}
