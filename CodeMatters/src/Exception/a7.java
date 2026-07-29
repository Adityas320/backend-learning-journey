package Exception;
class Resource implements AutoCloseable {
	 Resource() {
		System.out.println("opened");
	}
	 public void close() {
		 System.out.println("closed ");
	 }
}

public class a7 {
	public static void main(String args[]) {
		try(Resource a = new Resource()) {
			
			System.out.println("after");
		}
		System.out.println("after ");
	}
}
