

public class DoubleLinkedList {

    Node head;
    static class Node{
        int data;
        Node prev;
        Node next;

        Node(int d){
            data = d;
        }
    }

    public void push(int data){

        Node new_node = new Node(data);

        new_node.next = head;
        new_node.prev = null;

        if(head != null){
            head.prev = new_node;
        }
        head = new_node;
    }

    public void insertAfter(Node prev, int data){

        if(prev == null){
            System.out.println("Previous node cannot be null to insert your Node!!!!");
            return;
        }

        Node new_node = new Node(data);
        new_node.next = prev.next;
        prev.next = new_node;
        new_node.prev = prev;

        if(new_node.next != null){
            new_node.next.prev = new_node;
        }
    }

    public void delete(Node head_ref, Node key){

        if(head == null || key == null){
            System.out.println("Both head and key what you sent should not be empty!!!");
        }

        //case 1
        if(head == key){
            head = key.next;
        }

        //case 2
        if(key.next != null){
            key.next.prev = key.prev;
        }

        if(key.prev != null){
            key.prev.next = key.next;
        }

        return;
    }

    public void insertLast(int data){

        Node new_node = new Node(data);
        new_node.next = null;
        if(head == null){
            new_node.prev = null;
            head = new_node;
            return;
        }

        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = new_node;
        new_node.prev = last;
    }

    public void printList(Node node){
        while(node != null){
            System.out.println("The node is: " + node.data);
            node = node.next;
        }
    }

    public static void main(String args[]){
        DoubleLinkedList new_list = new DoubleLinkedList();
        new_list.push(12);
        new_list.push(34);
        new_list.push(35);
        new_list.printList(new_list.head);
    }
}
