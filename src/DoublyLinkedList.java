public class DoublyLinkedList {

    Node head;

    //Add a node at the front of the list
    public void push(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        newNode.prev = null;

        //If list not empty
        if (head != null) {
            head.prev = newNode;
        }

        head = newNode;
    }

    public void append(int data) {
        Node newNode = new Node(data);

        //If list is empty
        if (head == null) {
            newNode.prev = null;
            head = newNode;
            return;
        }
        //Else
        Node last = head;

        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
        newNode.prev = last;
    }

    public void printList() {
        Node curr = head;
        System.out.print("Doubly Linked List: [");
        while (curr != null) {
            System.out.print(curr.data + ", ");
            curr = curr.next;
        }
        System.out.print("]\n");
    }

    class Node {
        int data;
        Node prev;
        Node next;


        Node(int data) {
            this.data = data;
        }
    }
}

