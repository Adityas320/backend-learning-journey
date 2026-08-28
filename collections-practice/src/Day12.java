import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
public class Day12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = new ArrayList<>();
		nums.add(30);
		nums.add(10);
		nums.add(50);
		nums.add(20);
		nums.add(40);
		
		System.out.println("original: " + nums);
		
		Collections.sort(nums);
		System.out.println("sorted: "+ nums);
		
		Collections.reverse(nums);
		System.out.println("reversed: "+ nums);
		
		System.out.println("max: "+ Collections.max(nums));
		System.out.println("min: "+ Collections.min(nums));
		
		Collections.shuffle(nums);
		System.out.println("shuffled: "+ nums);
		
		Collections.sort(nums);
		
		List<Integer> big = nums.stream()
				.filter(n -> n>20)
				.collect(Collectors.toList());
		System.out.println("Greater than 20 : "+big);
		
		List<Integer> doubled = nums.stream()
				.map(n -> n*2)
				.collect(Collectors.toList());
		System.out.println(doubled);
		
		int total = nums.stream()
		.mapToInt (n->n) 
		.sum();
		System.out.println("Sum: "+ total);
//
	}
	//
	//
	//
	//
	//
	//

}
