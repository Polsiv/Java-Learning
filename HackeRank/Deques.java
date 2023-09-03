import java.util.ArrayDeque;
import java.util.Deque;

public class Deques {
    public static void main(String[] args) {

        Deque<String> dq = new ArrayDeque<String>();

        //queue mode------------------------------------------------------

        dq.offerLast("element1");
        dq.offerLast("element2");
        System.out.println(dq);

        String first = dq.pollFirst();
        String second = dq.pollFirst();

        System.out.println(first + " " + second);

        //Stackmode ------------------------------------------------------

        Deque<String> deque = new ArrayDeque<String>();

        deque.offerFirst("Silv");
        deque.offerFirst("SIlv2");
        System.out.println(deque);

        String third = deque.pollFirst();
        String fourth = deque.pollFirst();
        System.out.println(third + " " + fourth);

        //Apending elements -----------------------------------------------

        deque.add("1"); //ads the element at the end
        deque.addLast("2");
        deque.addFirst("3");

        deque.offer("4"); //adds the element to the end
        deque.offerLast("5");
        deque.offerFirst("6");

        deque.push("7"); //at the beggining

        System.out.println(deque);


        //Add: if element cannot be added throws an exception error
        //offer: returns false

        //Peeking elements ----------------------------------------------

        String elementA = deque.peek();
        String ElementB = deque.peekFirst();
        String ElementC = deque.peekLast();

        System.out.println("A: " + elementA);
        System.out.println("B: " + ElementB);
        System.out.println("C: " + ElementC);
        

        String last1 = deque.getLast();
        String first1 = deque.getFirst();

        System.out.println("First: " + first1);
        System.out.println("last: " + last1);

        //Removing elements  ----------------------------------------------

        System.out.println(deque.remove());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());

        System.out.println(deque);

        System.out.println(deque.poll());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());

        System.out.println(deque.pop()); //removes the first
        System.out.println(deque);

        //Checking if deque contains specific element (returns true or false)-----------

        deque.add("1"); 
        deque.addLast("2");
        deque.addFirst("3");

        System.out.println(deque.contains("1"));

        //Checking the size of the deque-------------------------------------------------

        System.out.println(deque.size());

        //Iterating through elements----------------------------------------------------

        for(String i : deque){
            System.out.println(i);
        }

    }
}
