package src.linkedList.projects.problems;

/**
 * <p>
 * Implement a function to partition a linked list
 * around a value x, such that all nodes less than x
 * come before all nodes greater than or equal to x.
 * </p>
 */
public class Partition {

    public static void main(String[] args) {
        LinkedList linkedListPartition = new LinkedList();
        linkedListPartition.insert(1);
        linkedListPartition.insert(9);
        linkedListPartition.insert(5);
        linkedListPartition.insert(10);
        linkedListPartition.insert(2);
        linkedListPartition.traverse();
        partition(linkedListPartition, 6);
        linkedListPartition.traverse();
    }

    public static void partition(LinkedList ll, int x) {
        Node currentNode = ll.head;
        ll.tail = ll.head;
        while (currentNode != null) {
            Node next = currentNode.next;
            if (currentNode.value < x) {
                currentNode.next = ll.head;
                ll.head = currentNode;
            } else {
                ll.tail.next = currentNode;
                ll.tail = currentNode;
            }
            currentNode = next;
        }
        ll.tail.next = null;
    }
}