package src.linkedList.doublyLinkedList;

public class DoublyLinkedList {
    Node head;
    Node tail;
    int size;

    /**
     * Initialize doubly linked list
     * with head and tail reference
     * <p>
     * Time complexity - O(1)
     * Space complexity - O(1)
     * </p>
     *
     * @param nodeValue value of the node
     * @return head of the node
     */
    public Node initializeDLL(int nodeValue) {
        Node node = new Node(); //O(1)
        node.value = nodeValue; //O(1)
        node.next = null; //O(1)
        node.prev = null; //O(1)
        this.head = this.tail = node; //O(1)
        this.size++; //O(1)
        return this.head; //O(1)
    }

    /**
     * <p>Insert node value to the given
     * node location</p>
     * Time complexity - O(N)
     * Space complexity - O(1)
     *
     * @param nodeValue value of the node
     * @param location  location where the node to be inserted
     */
    public void create(int nodeValue, int location) {
        Node node = new Node(); //O(1)
        node.value = nodeValue; //O(1)
        if (this.head == null) { //O(1)
            initializeDLL(nodeValue); //O(1)
            return; //O(1)
        } else if (location == 0) { //O(1)
            node.next = this.head; //O(1)
            node.prev = null; //O(1)
            this.head.prev = node; //O(1)
            this.head = node; //O(1)
        } else if (location >= this.size) { //O(1)
            node.next = null; //O(1)
            this.tail.next = node; //O(1)
            node.prev = this.tail; //O(1)
            this.tail = node; //O(1)
        } else { //O(1)
            Node tempNode = this.head; //O(1)
            for (int i = 0; i < location - 1; i++) { //O(N)
                tempNode = tempNode.next; //O(1)
            }
            node.prev = tempNode; //O(1)
            node.next = tempNode.next; //O(1)
            tempNode.next = node; //O(1)
            node.next.prev = node; //O(1)
        }
        this.size++; //O(1)
    }

    /**
     * <p>Traverse through each node
     * and print node value to console</p>
     * Time Complexity - O(N)
     * Space Complexity - O(1)
     */
    public void traverse() {
        if (this.head != null) { //O(1)
            Node tempNode = this.head; //O(1)
            for (int i = 0; i < this.size; i++) { //O(N)
                System.out.print(tempNode.value); //O(1)
                if (i < this.size - 1) { //O(1)
                    System.out.print(" -> "); //O(1)
                }
                tempNode = tempNode.next; //O(1)
            }
            System.out.println(); //O(1)
        } else {
            System.out.println("Doubly linked list does not exist!"); // O(1)
        }
    }

    /**
     * <p>Traverse through each node
     * and print node value in reverse order
     * from tail to head</p>
     * Time Complexity - O(N)
     * Space Complexity - O(1)
     */
    public void reverseTraverse() {
        if (this.tail != null) { //O(1)
            Node tempNode = this.tail; //O(1)
            //ONE WAY OF TRAVERSAL
            for (int i = size; i > 0; i--) { //O(N)
                System.out.print(tempNode.value); //O(1)
                if (i > 1) { //O(1)
                    System.out.print(" <- "); //O(1)
                }
                tempNode = tempNode.prev; //O(1)
            }

            //SECOND WAY OF TRAVERSAL
         /*   for (int i = 0; i < this.size; i++) { //O(N)
                System.out.print(tempNode.value); //O(1)
                if (i != this.size - 1) { //O(1)
                    System.out.print(" <- "); //O(1)
                }
                tempNode = tempNode.prev; //O(1)
            }*/
            System.out.println(); //O(1)
        } else {
            System.out.println("Doubly linked list does not exist!"); // O(1)
        }
    }

    /**
     * <p>Search for the given value in the
     * doubly linked list</p>
     * Time Complexity - O(N)
     * Space Complexity - O(1)
     *
     * @param value - value to be searched in all nodes
     */
    public void search(int value) {
        if (this.head != null) { // O(1)
            Node tempNode = this.head; // O(1)
            for (int i = 0; i < this.size; i++) { // O(N)
                if (tempNode.value == value) { // O(1)
                    System.out.println(value + " found on node " + (i + 1)); // O(1)
                    return;
                }
                tempNode = tempNode.next; // O(1)
            }
            System.out.println("No node present with the given element!"); // O(1)
        } else {
            System.out.println("Doubly linked list does not exist!"); // O(1)
        }
    }

    /**
     * <p>
     * Delete node from the given location
     * </p>
     * Time Complexity - O(N)
     * Space Complexity - O(1)
     *
     * @param location - location of the node to be deleted
     */
    public void delete(int location) {
        if (head != null) { // O(1)
            if (location == 0) { // O(1)
                this.head = this.head.next; // O(1)
                this.head.prev = null; // O(1)
                if (this.size == 1) { // O(1)
                    this.head = this.tail = null; // O(1)
                }
                size--; // O(1)
            } else if (location >= this.size) { // O(1)

                //With Loop
                /** Node tempNode = this.head;
                 for (int i = 0; i < this.size - 1; i++) {
                 tempNode = tempNode.next;
                 } */
                Node tempNode = this.tail; // O(1)
                if (tempNode == this.head) { // O(1)
                    this.head = this.tail = null; // O(1)
                    size--; // O(1)
                    return;
                }
                this.tail = tempNode.prev; // O(1)
                this.tail.next = null; // O(1)
                size--; // O(1)
            } else {
                Node tempNode = this.head; // O(1)
                for (int i = 0; i < location - 1; i++) { // O(N)
                    tempNode = tempNode.next; // O(1)
                }
                tempNode.next = tempNode.next.next; // O(1)
                tempNode.next.prev = tempNode; // O(1)
                size--;
            }
        } else {
            System.out.println("Doubly linked list does not exist!"); // O(1)
        }
    }


    /**
     * <p>
     * Delete entire doubly linked list.
     * Require head and tail reference to point to null and
     * previous reference of all nodes to null to break the
     * connection between nodes and make nodes available
     * for garbage collection
     * </p>
     * Time Complexity - O(N)
     * Space Complexity - O(1)
     */
    public void deleteEntireDoublyLinkedList() {
        if (head != null) { // O(1)
            Node tempNode = this.head; // O(1)
            for (int i = 0; i < this.size; i++) { // O(N)
                tempNode.prev = null; // O(1)
                tempNode = tempNode.next; // O(1)
            }
            this.head = this.tail = null; // O(1)
        } else {
            System.out.println("Doubly linked list does not exist!"); // O(1)
        }
    }
}
