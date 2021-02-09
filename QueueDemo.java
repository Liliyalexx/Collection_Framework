package eg1;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue<String> qs = new LinkedList<String>();
		qs.add("hello");
		qs.add("bye");
		qs.add("true");
		qs.add("a");
		System.out.println(qs);		
				
				
		Queue <Integer> q2 = new LinkedList<>();
		q2.add(300);
		q2.add(null);
		q2.add(100);
		q2.add(500);
		q2.add(null);
		System.out.println(q2);
		
		
		
//		 Add elements {0,1,2,3,4,5} to the queue
		 for (int i =0; i< 5; i++) {
			 q2.add(i);
			 System.out.println("Elements of = " +q2);
		 }
		 int size = q2.size();
		 System.out.println("Size of queue = " +size);
		 
//		 print head
		 System.out.println("Queue's head = " + q2.peek());
		 
//       print head and deleted the head 
	     System.out.println("Queue's head = " + q2.poll()); 
	     System.out.println("Queue is = " + q2);
	     
//       deleted the head 
	      System.out.println("Deleted head " + q2.remove()); 
	      System.out.println("Queue is = " + q2);
	      
	      
	}

}
