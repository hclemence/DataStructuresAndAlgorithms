public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList();
        myLinkedList.insert(1);
        myLinkedList.insert(7);
        myLinkedList.insert(-1);
        myLinkedList.insert(67);
        myLinkedList.insert(44);
        myLinkedList.printList();

        DoublyLinkedList myDLinkedList = new DoublyLinkedList();
        myDLinkedList.push(-42);
        myDLinkedList.push(99);
        myDLinkedList.push(17);
        myDLinkedList.append(20);
        myDLinkedList.append(4);
        myDLinkedList.printList();

        BinarySearch myBinarySearch = new BinarySearch();
        int[] nums = {-1, 9, 15, 17, 26, 32, 35};
        System.out.println("32 is at index " + myBinarySearch.search(nums, 32) + " in the array");
        System.out.println("-1 is at index " + myBinarySearch.search(nums, -1) + " in the array");


    }
}
