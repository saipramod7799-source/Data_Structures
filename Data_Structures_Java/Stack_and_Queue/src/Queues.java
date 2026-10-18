
import java.util.*;
public class Queues {

    public static void main(String args[]){

        Queue que = new LinkedList();

        que.add("Ironman");
        que.add("Spiderman");
        que.add("CaptainAmerica");
        que.add("Thor");

        System.out.println("My queue contains: " + que);
        System.out.println("My queue contains: " + que.peek());
        System.out.println("My queue contains: " + que.remove());
        System.out.println("My queue contains: " + que.element());
        System.out.println("My queue contains: " + que);

    }
}
