package src.linkedList.projects.problems;

public class LinkedList {
    Node head;
    Node tail;
    int size;

    public void createLinkedList(int nodeValue) {
        this.head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;
        this.head = this.tail = node;
        this.size++;
    }

    public void insert(int nodeValue) {
        if (this.head == null) {
            createLinkedList(nodeValue);
        } else {
            Node node = new Node();
            node.value = nodeValue;
            node.next = null;
            this.tail.next = node;
            this.tail = node;
            this.size++;
        }
    }

    public void traverse() {
        if (this.head != null) {
            Node tempNode = this.head;
            for (int i = 0; i < this.size; i++) {
                System.out.print(tempNode.value);
                if (i != this.size - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
            System.out.println(); //O(1)
        } else {
            System.out.println("Linked list do not exist!");
        }
    }

}
