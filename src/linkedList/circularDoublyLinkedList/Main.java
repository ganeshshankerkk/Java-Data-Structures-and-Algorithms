package src.linkedList.circularDoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularDoublyLinkedList circularDoublyLinkedList = new CircularDoublyLinkedList();
        //Initialization
        circularDoublyLinkedList.initializeCDLL(5);

        //Insertion
        circularDoublyLinkedList.insert(10, 0);
        circularDoublyLinkedList.insert(12, 0);
        circularDoublyLinkedList.insert(24, 10);
        circularDoublyLinkedList.insert(6, 2);

        //Traversal
        circularDoublyLinkedList.traverse();
        circularDoublyLinkedList.reverseTraverse();

        //Search
        circularDoublyLinkedList.search(10);
        circularDoublyLinkedList.search(11);

        //Deletion
        circularDoublyLinkedList.delete(0);
        circularDoublyLinkedList.traverse();
        circularDoublyLinkedList.reverseTraverse();

        //Delete entire list
        circularDoublyLinkedList.deleteEntireCircularDoublyLinkedList();
        circularDoublyLinkedList.traverse();
        circularDoublyLinkedList.reverseTraverse();
    }
}
