package src.linkedList.projects.problems;

import java.util.HashSet;

/**
 * Problem Statement: Given an unsorted linked list,
 * remove duplicate elements from the list
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.createLinkedList(1);
        linkedList.insert(4);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(23);
        linkedList.insert(13);
        linkedList.insert(4);
        linkedList.insert(4);
        linkedList.insert(5);
        linkedList.insert(4);
        linkedList.insert(5);

        linkedList.traverse();
        remove(linkedList);
        remove(linkedList);
        linkedList.traverse();
    }

    /**
     * @param linkedList un-sorted linked list
     *                   with or without duplicate
     *                   elements
     */
    public static void remove(LinkedList linkedList) {
        HashSet<Integer> uniqueElements = new HashSet<>();
        if (linkedList.head != null) {
            Node current = linkedList.head;
            Node prev = null;
            while (current != null) {
                int curValue = current.value;
                if (uniqueElements.contains(curValue)) {
                    prev.next = current.next;
                    linkedList.size--;
                } else {
                    uniqueElements.add(curValue);
                    prev = current;
                }
                current = current.next;
            }
        } else {
            System.out.println("Linked list do not exist!");
        }
    }
}
