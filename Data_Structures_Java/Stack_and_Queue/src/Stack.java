
import java.util.Stack;
class Stacks {

    public static void main(String args[]){

        Stack stack = new Stack();
        stack.push("Pulsar");
        stack.push("Apache");
        stack.push("Yamaha");
        stack.push("kTM");
        System.out.println("The item " + stack.pop() + " removed");
        System.out.println("The item " + stack.peek() + " is in top of the list");
        System.out.println("The stack is empty: " + stack.isEmpty());
        System.out.println("The entire stack is: " + stack);
        System.out.println("The item " + "pulsar" + " is: " + "at " + stack.search("Pulsar") + " position from top");

    }
}
