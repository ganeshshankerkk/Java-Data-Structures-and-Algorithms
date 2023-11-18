package src.linkedList.doublyLinkedList;

public class Main {
    public static void main(String[] args) {

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.initializeDLL(3);
        System.out.println("doublyLinkedList Size: " + doublyLinkedList.size);
        System.out.println("Head value: "+doublyLinkedList.head.value);
        System.out.println("Tail value: "+doublyLinkedList.tail.value);

        doublyLinkedList.insert(4, 0);
        doublyLinkedList.insert(5, 0);
        doublyLinkedList.insert(6, 0);
        doublyLinkedList.insert(10, 3);
        doublyLinkedList.traverse();
        System.out.println("doublyLinkedList Size: " + doublyLinkedList.size);

        doublyLinkedList.insert(12, 13);
        doublyLinkedList.insert(23, 133);
        doublyLinkedList.traverse();
        System.out.println("doublyLinkedList Size: " + doublyLinkedList.size);

        doublyLinkedList.search(12);
        doublyLinkedList.search(27);

        doublyLinkedList.traverse();
        doublyLinkedList.delete(3);
        doublyLinkedList.traverse();
        doublyLinkedList.reverseTraverse();

        doublyLinkedList.deleteEntireDoublyLinkedList();
        doublyLinkedList.traverse();
        doublyLinkedList.reverseTraverse();
    }
}
