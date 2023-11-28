package src.stack.linkedListStack;

public class LinkedList {

    Node head;
    Node tail;
    int size;

    /**
     * Time Complexity= O(1)
     * Space Complexity = O(1)
     */
    public Node createSinglyLinkedList(int nodeValue) {
        this.head = new Node(); //O(1)
        Node node = new Node(); //O(1)
        node.value = nodeValue; //O(1)
        node.next = null; //O(1)
        this.head = node; //O(1)
        this.tail = node; //O(1)
        this.size++; //O(1)
        return head; //O(1)
    }

    /**
     * Time Complexity - O(N)
     * Space Complexity - O(1)
     *
     * @param nodeValue - Value of the node
     * @param location  - location at which the node to be created
     */
    public void insert(int nodeValue, int location) {
        Node node = new Node(); //O(1)
        node.value = nodeValue; //O(1)
        if (head == null) { //O(1)
            // create a singly linked list
            createSinglyLinkedList(nodeValue);
        } else if (location == 0) { //O(1)
            //Insert at first position
            node.next = head; //O(1)
            this.head = node; //O(1)
        } else if (location >= size) { //O(1)
            // Insert at the end
            node.next = null; //O(1)
            this.tail.next = node; //O(1)
            this.tail = node; //O(1)
        } else {
            // Insert in the middle
            Node tempNode = head; //O(1)
            int index = 0; //O(1)
            while (index < location - 1) { //O(N)
                tempNode = tempNode.next; //O(1)
                index++; //O(1)
            }
            Node nextNode = tempNode.next; //O(1)
            tempNode.next = node; //O(1)
            node.next = nextNode; //O(1)
        }
        this.size++; //O(1)

    }

    /**
     * Deleting a node from singly linked list
     * Time Complexity - O(N)
     * Space Complexity - O(1)
     *
     * @param location - location of the node to be deleted
     */
    public void delete(int location) {
        if (head == null) {
            System.out.println("Singly Linked List does not exist");
            return;
        } else if (location == 0) {
            // There are two cases.
            // One: If there are multiple nodes in the list
            this.head = head.next;
            size--;
            // Two: If there is only one node in the singly linked list
            if (size == 0) { // Size becomes zero after deletion of node in above logic
                this.tail = null;
            }
        } else if (location >= this.size) {
            //Delete the tail node
            Node tempNode = this.head;
            for (int i = 0; i < this.size - 1; i++) { // Looping till size-1 because here we need to find the node just before last node  // O(N)
                tempNode = tempNode.next;
            }
            //if there is only one element in singly linked list
            if (tempNode == head) {
                head = tail = null;
                size--;
                return;
            }
            //If there are more than one element in singly linked list
            tempNode.next = null;
            this.tail = tempNode;
            size--;
        } else { // delete any node other than head or tail
            Node tempNode = this.head;
            for (int i = 0; i < location - 1; i++) { // O(N)
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;

        }
    }
}
