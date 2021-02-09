package eg2;
import java.util.LinkedList;
import java.util.Queue;

public class PriorityQueue {

	public static void main(String[] args) {
//		
//		Queue<String> pq = new PriorQueue<String>();
//		pq.add("hello");
//		pq.add("bye");
//		pq.add("true");
//		pq.add("a");
//		System.out.println(pq);		
				
				
		Queue <Integer> pq2 = new PriorQueue<>();
		pq2.add(300);
		pq2.add(null);
		pq2.add(100);
		pq2.add(500);
		pq2.add(null);
		System.out.println(pq2);
		
		
		
//		 Add elements {0,1,2,3,4,5} to the queue
		 for (int i =0; i< 5; i++) {
			 pq2.add(i);
			 System.out.println("Elements of = " +pq2);
		 }
		 int size = pq2.size();
		 System.out.println("Size of queue = " +size);
		 
//      Printing the top element of the PriorityQueue 
	     System.out.println(pq2.peek()); 
		 
// Printing the top element and removing it from the PriorityQueue container 
	     System.out.println(pq2.poll()); 
//       deleted the head 
	      System.out.println("Deleted head " + pq2.remove()); 
	      System.out.println("Priority Queue is = " + pq2);
	      
	      
	}

}
