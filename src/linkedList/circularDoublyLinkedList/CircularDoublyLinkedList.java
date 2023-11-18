package src.linkedList.circularDoublyLinkedList;

/**
 * @author Ganesh Shanker K K
 */
public class CircularDoublyLinkedList {
    Node head;
    Node tail;
    int size;

    /**
     * <p>Initialize circular doubly linked list
     * with one node
     * Time Complexity - O(1)
     * Space Complexity - O(1)
     * </p>
     *
     * @param nodeValue
     * @return head node
     */
    public Node initializeCDLL(int nodeValue) {
        this.head = new Node(); // O(1)
        Node node = new Node(); // O(1)
        node.value = nodeValue; // O(1)
        node.next = node.prev = node; // O(1)
        this.head = this.tail = node; // O(1)
        this.size++; // O(1)
        return this.head; // O(1)
    }

    /**
     * <p>Insert node value to the given
     * node location</p>
     * Time complexity - O(N)
     * Space complexity - O(1)
     *
     * @param nodeValue - value of the node
     * @param location  - location where the node to be inserted
     */
    public void insert(int nodeValue, int location) {
        Node node = new Node(); // O(1)
        node.value = nodeValue; // O(1)
        if (this.head == null) { // O(1)
            //Initialize the list if list is null
            initializeCDLL(nodeValue); // O(1)
            return;
        } else if (location == 0) { // O(1)
            //Insert new node to the beginning of the list
            node.next = this.head; // O(1)
            node.prev = this.tail; // O(1)
            this.head.prev = node; // O(1)
            this.tail.next = node; // O(1)
            this.head = node; // O(1)
        } else if (location >= this.size) { // O(1)
            //Insert new node to the end of the list
            node.next = this.head; // O(1)
            node.prev = this.tail; // O(1)
            this.head.prev = node; // O(1)
            this.tail.next = node; // O(1)
            this.tail = node; // O(1)
        } else {
            /*Insert new node at a specific location anywhere in the list
            other than head and tail*/
            Node tempNode = this.head; // O(1)
            for (int i = 0; i < location - 1; i++) { // O(N)
                tempNode = tempNode.next; // O(1)
            }
            node.prev = tempNode; // O(1)
            node.next = tempNode.next; // O(1)
            node.next.prev = node; // O(1)
            tempNode.next = node; // O(1)
        }
        this.size++; // O(1)
    }

    /**
     * <p>Traverse through each node
     * and print node value to the console</p>
     * Time Complexity - O(N)
     * Space Complexity - O(1)
     */
    public void traverse() {
        if (head != null) { // O(1)
            Node tempNode = this.head; // O(1)
            for (int i = 0; i < this.size; i++) { // O(N)
                System.out.print(tempNode.value); // O(1)
                if (i != this.size - 1) { // O(1)
                    System.out.print(" -> "); // O(1)
                }
                tempNode = tempNode.next; // O(1)
            }
            System.out.println(); // O(1)
        } else {
            System.out.println("Circular doubly linked list does not exist!"); // O(1)
        }
    }

    /**
     * <p>Traverse through each node
     * and print node value in reverse order
     * from tail to head in the console</p>
     * Time Complexity - O(N)
     * Space Complexity - O(1)
     */
    public void reverseTraverse() {
        if (head != null) { // O(1)
            Node tempNode = this.tail; // O(1)
            for (int i = 0; i < this.size; i++) { // O(N)
                System.out.print(tempNode.value); // O(1)
                if (i != this.size - 1) { // O(1)
                    System.out.print(" <- "); // O(1)
                }
                tempNode = tempNode.prev; // O(1)
            }
            System.out.println(); // O(1)
        } else {
            System.out.println("Circular doubly linked list does not exist!"); // O(1)
        }
    }

}
