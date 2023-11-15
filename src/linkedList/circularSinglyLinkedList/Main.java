package src.linkedList.circularSinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();

        circularSinglyLinkedList.create(4);

        circularSinglyLinkedList.insert(1, 0);
        circularSinglyLinkedList.insert(2, 1);
        circularSinglyLinkedList.insert(5, 7);

        circularSinglyLinkedList.search(2);
        circularSinglyLinkedList.search(10);

        circularSinglyLinkedList.traverse();

        circularSinglyLinkedList.delete(2);
        circularSinglyLinkedList.deleteEntireCircularSinglyLinkedList();

        circularSinglyLinkedList.traverse();
    }
}
