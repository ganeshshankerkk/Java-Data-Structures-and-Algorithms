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
    }
}
