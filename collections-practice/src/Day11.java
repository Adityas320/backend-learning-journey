import java.util.LinkedList;
import java.util.Queue;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class Day11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> line = new LinkedList<>();
		Deque<String> stack = new ArrayDeque<>();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		line.offer("alice");
		line.offer("bob");
		line.offer("charlie");
		
		stack.push("first");
		stack.push("second");
		stack.push("third");
		
		pq.offer(50);
		pq.offer(10);
		pq.offer(30);
		pq.offer(20);
		
		System.out.println(line);
		System.out.println(line.poll());
		System.out.println(line.poll());
		System.out.println(line);
		
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack);
		
		System.out.println(pq.poll());   
		System.out.println(pq.poll());   
		System.out.println(pq.poll());   

	}

}
