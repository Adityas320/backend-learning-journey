import java.util.HashMap;
import java.util.Map;
public class Day8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "the cat sat on the mat the cat";
		String[] words = sentence.split(" ");
		
		Map<String,Integer> counts  = new HashMap<>();
//		for(String word :words) {
//			if(counts.containsKey(word)) {
//				counts.put(word, counts.get(word)+1);
//			} else {
//				counts.put(word, 1);
//			}
//			
//		}
		String word = "banana";
		Map<Character, Integer> letterCounts = new HashMap<>();

		for (char c : word.toCharArray()) {
		    letterCounts.put(c, letterCounts.getOrDefault(c, 0) + 1);
		}

		System.out.println(letterCounts);
//		for (String word : words) {
//		    counts.put(word, counts.getOrDefault(word, 0) + 1);
//		}
//		System.out.println(counts);
		
	}

}
