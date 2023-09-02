import java.util.LinkedList;
import java.util.Queue;

public class Queues{
    public static void main(String[] args) {
        
        Queue line = new LinkedList();

        //Adding elements to the queue
        line.add("Jean");
        line.add("Jocksan");
        line.add("Susan");

        System.out.println(line);

        //removing the first element

        line.poll();
        System.out.println(line);

        //printing the removed element
        //System.out.println(line.poll());

        
        System.out.println(line.peek());

        System.out.println("===================================================");

        Queue<String> q = new LinkedList<String>();

        q.add("A");
        q.add("b");
        q.add("C");

        //printing the queue size
        System.out.println(q.size());

        //returns boolean depending if it contains a certain element or not
        System.out.println(q.contains("b"));

        //turns the queue into an array
        //System.out.println(q.toArray());

        //printing n-th element of the array
        System.out.println(q.toArray()[1]);


    }
}