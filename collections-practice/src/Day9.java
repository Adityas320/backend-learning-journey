import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;
public class Day9 {
	public static void main(String[] args) {
		Map<String,Integer> hash = new HashMap<>();
		Map<String, Integer> linked = new LinkedHashMap<>();
        Map<String, Integer> tree = new TreeMap<>();
        
        String[] keys = {"charlie","alice","bob","alice"};
        int[] vals = {3,1,2,9};
        
        for(int i=0;i<keys.length;i++) {
        	hash.put(keys[i], vals[i]);
        	linked.put(keys[i], vals[i]);
        	tree.put(keys[i], vals[i]);
        	
        }
        System.out.println("hashmap:   "+hash);
        System.out.println("linkedhashmap:   "+linked);
        System.out.println("treemap:   "+tree);
	}

}
