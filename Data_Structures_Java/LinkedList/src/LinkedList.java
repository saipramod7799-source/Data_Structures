
public class LinkedList {

    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    public void push(int data){
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

    void deleteLinkedList(){
        head = null;
    }

    public void insertAt(Node prev_node, int data){
        if(prev_node == null){
            System.out.println("previous node seems to empty!!!");
            return;
        }
        Node new_node = new Node(data);
        prev_node.next = new_node;
        new_node.next = prev_node.next;
    }

    public void append(int data){
        Node new_node = new Node(data);

        if(head == null){
            head = new Node(data);
            return;
        }
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = new_node;
        new_node.next = null;
    }

    public void delete(int key){
        Node temp = head, prev_node = null;
        if(temp != null && temp.data == key){
            head = temp.next;
            return;
        }
        while( temp != null && temp.data!= key){
            prev_node = temp;
            temp = temp.next;
        }
        prev_node.next = temp.next;
    }

    public void printList(){
        Node node = head;
        while(node.next != null){
            System.out.println("The node data is: " + node.data);
            node = node.next;
        }
        System.out.println("the node data is: " + node.data);
    }

    public int getNodeCount(Node node){
        if(node == null){
            return 0;
        }
        return 1 + getNodeCount(node.next);
    }

    public int getCount(){
        return getNodeCount(head);
    }

    public static void main(String args[]){
        LinkedList linkedlist = new LinkedList();
        linkedlist.push(5);
        linkedlist.append(12);
        linkedlist.append(100);
        linkedlist.push(4);
//        linkedlist.delete(100);
        linkedlist.printList();
        System.out.println("The length of the linked list: " + linkedlist.getCount());
    }

}
