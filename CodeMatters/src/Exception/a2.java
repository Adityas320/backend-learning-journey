package Exception;
class prep {
	public int process (String s) {
		try {
			return Integer.parseInt(s);
		} catch(NumberFormatException e) {
			return -1;
		} catch(Exception e) {
			return -2;
		}
	}
}

public class a2 {

	public static void main(String[] args) {
    prep e1= new prep ();
    System.err.println(e1.process("11"));

	}

}
