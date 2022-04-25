public class LinkedList {

    Node head = null;
    Node tail = null;

    public void insert(int data) {
        Node newNode = new Node(data);

        //If LinkedList is empty
        if (head == null) {
            head = newNode;
        }
        else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    public void printList() {
        Node curr = head;
        System.out.print("Linked List: [");
        while (curr != null) {
            System.out.print(curr.data + ", ");
            curr = curr.next;
        }
        System.out.print("]\n");
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
}
