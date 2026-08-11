import java.util.HashMap;
import java.util.Map;
public class Day7 {

	public static void main(String[] args) {
		Map<String,String> phone = new HashMap<>();
		
		phone.put("amit", "98765");
		phone.put("sara", "12345");
		phone.put("john", "55555");
		
		System.out.println(phone);
		System.out.println(phone.get("sara"));
		System.out.println(phone.get("nobody"));
		System.out.println(phone.getOrDefault("nobody", "not found"));
		System.out.println(phone.getOrDefault("amit", "not found"));
		System.out.println(phone.containsKey("amit"));
		System.out.println(phone.size());
		
		System.out.println(phone.get("amit"));
		phone.put("amit", "00000");
		System.out.println(phone.get("amit"));
		System.out.println(phone.size());
		
		for(Map.Entry<String, String> entry : phone.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}

	}

}
