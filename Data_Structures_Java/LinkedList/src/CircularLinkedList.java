
public class  CircularLinkedList {

    static Integer length = 0;
    static class Node{
        int data;
        Node next;
    }

    static Node push(Node head_ref, int value){

        Node new_node = new Node();
        Node temp = head_ref;
        new_node.data = value;
        new_node.next = head_ref;

        if(head_ref != null){
            while(temp.next != head_ref){
                temp = temp.next;
            }
            temp.next = new_node;
        }else{
            new_node.next = new_node;
        }
        head_ref = new_node;
        return head_ref;

    }

    static void lengthList(Node head){
        Node temp = head;

        if(head != null){
            do{
                System.out.println(temp.data + " ");
                temp = temp.next;
                length++;
            }while (temp != head);
        }
    }

    static Node deleteNode(Node head, int val){

        //Linked list is empty
        if(head == null){
            System.out.println("Nothing is there to delete");
            return null;
        }
        Node temp = head, prev = new Node();
        //deleting the head
        //if node is the only node
        if(temp.next == head){
            head = null;
            return head;
        }

        while(temp.data != val){
            if(temp.next == head){
                System.out.println("Looping complete!!! Nothing to delete");
                break;
            }
            prev = temp;
            temp = temp.next;
        }

        //deleting the head
        //if there are more nodes
        if(temp == head){
            prev = head;
            while (prev.next != head){
                prev = prev.next;
            }
            head = temp.next;
            prev.next = head;
        }
        else if (temp.next == head) {
            prev.next = head;
        }else{
            prev.next = temp.next;
        }
        return head;
    }

    public static void main(String args[]){
        Node head = null;
        head = push(head, 23);
        head = push(head, 25);
        head = push(head, 89);
        head = deleteNode(head, 25);
        lengthList(head);
        System.out.println("The length of the linked list is: " + length);

    }

}
