package src.linkedList.singlyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.traverse();
        singlyLinkedList.createSinglyLinkedList(5);
        System.out.println(singlyLinkedList.head.value);
        singlyLinkedList.insert(4, 0);
        System.out.println(singlyLinkedList.head.value);
        System.out.println(singlyLinkedList.tail.value);
        singlyLinkedList.insert(6, 3);
        System.out.println(singlyLinkedList.tail.value);
        singlyLinkedList.search(4);
        singlyLinkedList.search(5);
        singlyLinkedList.search(6);
        singlyLinkedList.search(8);
        System.out.println("-------- Before Deletion --------");
        singlyLinkedList.traverse();
        singlyLinkedList.delete(0);
        System.out.println("-------- After Deletion --------");
        singlyLinkedList.traverse();
        singlyLinkedList.deleteEntireSinglyLinkedList();
        singlyLinkedList.traverse();
    }


}
