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


    }
}