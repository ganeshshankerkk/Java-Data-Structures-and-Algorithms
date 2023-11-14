package src.linkedList.singlyLinkedList;

public class SinglyLinkedList {
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
     * @param nodeValue - Value of the note
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
     * Traverse through the singly linked list
     * and print value of each node
     * Time Complexity - O(N)
     * Space Complexity - O(1)
     */
    public void traverse() {
        if (this.head == null) { //O(1)
            System.out.println("Singly Linked List doesn't exist"); //O(1)
        } else {
            int index = 0; //O(1)
            Node tempNode = this.head; //O(1)
            while (index < this.size) { //O(N)
                System.out.print(tempNode.value); //O(1)
                if (index != this.size - 1) { //O(1)
                    System.out.print(" -> "); //O(1)
                }
                tempNode = tempNode.next; //O(1)
                index++; //O(1)
            }
            System.out.println(); //O(1)
        }
    }

    /**
     * Time Complexity - O(N)
     * Space Complexity - O(1)
     *
     * @param nodeValue
     * @return true if node found and false otherwise
     */
    public boolean search(int nodeValue) {
        if (head != null) { //O(1)
            Node tempNode = head; //O(1)
            for (int i = 0; i < this.size; i++) { //O(N)
                if (tempNode.value == nodeValue) { //O(1)
                    System.out.println("Found node " + nodeValue + " at location " + (i + 1)); //O(1)
                    return true;
                }
                tempNode = tempNode.next; //O(1)
            }
        }
        System.out.println("Node not found!"); //O(1)
        return false;
    }

    /**
     * Deleting a node from singly linked list
     * Time Complexity -
     * Space Complexity -
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

    /**
     * Delete entire singly linked list
     * By changing the reference of head and tail node to null,
     * garbage collector recognize it as a garbage and delete nodes
     * from memory.
     * Time Complexity - O(1)
     * Space Complexity - O(1)
     */
    public void deleteEntireSinglyLinkedList() { // O(1)
        this.head = null; // O(1)
        this.tail = null; // O(1)
        System.out.println("Singly linked list deleted successfully!"); // O(1)
    }
}
