package src.linkedList.circularSinglyLinkedList;

public class CircularSinglyLinkedList {
    Node head;
    Node tail;
    int size;

    /**
     * Time Complexity - O(1)
     * Space Complexity - O(1)
     *
     * @param nodeValue - value of the node
     * @return head of the circular singly linked list
     */
    public Node create(int nodeValue) {
        head = new Node(); // O(1)
        Node tempNode = new Node();
        tempNode.value = nodeValue; // O(1)
        tempNode.next = tempNode; // O(1)
        this.head = this.tail = tempNode; // O(1)
        size++; // O(1)
        return head;
    }

    /**
     * Time Complexity - O(N)
     * Space Complexity - O(1)
     *
     * @param nodeValue
     * @param location
     */
    public void insert(int nodeValue, int location) {
        Node node = new Node(); // O(1)
        node.value = nodeValue; // O(1)
        if (this.head == null) { // O(1)
            create(nodeValue); // O(1)
            return;
        } else if (location == 0) { // O(1)
            // Insert at the beginning
            node.next = head; // O(1)
            this.head = node; // O(1)
            this.tail.next = node; // O(1)
        } else if (location >= this.size) { // O(1)
            // Insert at the end
            tail.next = node; // O(1)
            tail = node; // O(1)
            tail.next = head; // O(1)
        } else {
            Node tempNode = this.head; // O(1)
            for (int i = 0; i < location - 1; i++) {  // O(N)
                tempNode = tempNode.next; // O(1)
            }
            node.next = tempNode.next; // O(1)
            tempNode.next = node; // O(1)
        }
        this.size++; // O(1)
    }

    /**
     * Time Complexity - O(N)
     * Space Complexity - O(1)
     */
    public void traverse() {
        if (head != null) {  // O(1)
            Node tempNode = head; // O(1)
            for (int i = 0; i < this.size; i++) { // O(N)
                System.out.print(tempNode.value); // O(1)
                if (i != this.size - 1) { // O(1)
                    System.out.print(" -> "); // O(1)
                }
                tempNode = tempNode.next; // O(1)
            }

            System.out.println(); // O(1)
        } else {
            System.out.println("Circular singly linked list does not exist!"); // O(1)
        }
    }

    /**
     * Time Complexity - O(N)
     * Space Complexity - O(1)
     *
     * @param value
     */
    public void search(int value) {
        if (head != null) {  // O(1)
            Node tempNode = head; // O(1)
            for (int i = 0; i < this.size; i++) { // O(N)
                if (tempNode.value == value) {
                    System.out.println("Found node value " + value + " at location " + (i + 1)); //O(1)
                    return;
                }
                tempNode = tempNode.next; // O(1)
            }
            System.out.println("Node not found with element " + value); // O(1)
        }
    }

    /**
     * Time Complexity - O(N)
     * Space Complexity - O(1)
     *
     * @param location - location of the node to be deleted
     */
    public void delete(int location) {
        if (head != null) { // O(1)
            if (location == 0) { // O(1)
                head = head.next; // O(1)
                tail.next = head; // O(1)
                this.size--; // O(1)
                if (this.size == 1) { // O(1)
                    tail = null; // O(1)
                    head.next = null; // O(1)
                    head = null; // O(1)
                }
            } else if (location >= this.size) { // O(1)
                Node tempNode = head; // O(1)
                for (int i = 0; i < this.size - 1; i++) { // O(N)
                    tempNode = tempNode.next; // O(1)
                }
                if (tempNode == head) { // O(1)
                    tail = null; // O(1)
                    head.next = null; // O(1)
                    head = null; // O(1)
                    this.size--; // O(1)
                    return; // O(1)
                }
                tempNode.next = head; // O(1)
                tail = tempNode; // O(1)
                this.size--; // O(1)

            } else {
                Node tempNode = head; // O(1)
                for (int i = 0; i < location - 1; i++) { // O(N)
                    tempNode = tempNode.next; // O(1)
                }
                tempNode.next = tempNode.next.next; // O(1)
                this.size--; // O(1)
            }
        } else {
            System.out.println("Circular singly linked list does not exist!"); // O(1)
        }
    }

    /**
     * Delete entire circular singly linked list
     * By changing the reference of head and tail node to null and last node
     * next reference to null,
     * garbage collector recognize it as a garbage and delete nodes
     * from memory.
     * Time Complexity - O(1)
     * Space Complexity - O(1)
     */
    public void deleteEntireCircularSinglyLinkedList() { // O(1)
        if (head != null) {
            this.tail.next = null; // O(1)
            this.head = null; // O(1)
            this.tail = null; // O(1)
            System.out.println("Singly linked list deleted successfully!"); // O(1)
        } else {
            System.out.println("Circular singly linked list does not exist!"); // O(1)
        }
    }
}
