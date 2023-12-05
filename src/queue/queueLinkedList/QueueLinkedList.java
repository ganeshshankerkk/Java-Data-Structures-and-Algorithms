package src.queue.queueLinkedList;

public class QueueLinkedList {
    Node head;
    Node tail;
    int size;

    public QueueLinkedList() {
        head = null;
        tail = null;
    }

    /**
     * Insert given element to the tail of the queue
     * Time Complexity - O(1)
     * Space Complexity - O(1)
     *
     * @param value : value to be inserted to the queue
     */
    public void enQueue(int value) {
        Node node = new Node();
        node.value = value;
        node.next = null;
        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
        System.out.println(value + " inserted to circular queue successfully!"); //O(1)

    }

    /**
     * Time Complexity - O(1)
     * Space Complexity - O(1)
     *
     * @return true if this queue is empty and false otherwise
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Removes the element at the beginning of this queue
     * and returns that element as the value of this function.
     * Time Complexity - O(1)
     * Space Complexity - O(1)
     *
     * @return The element at the beginning of this queue from head
     */
    public int deQueue() {
        int firstElement = -1;
        if (!isEmpty()) {
            firstElement = head.value;
            head = head.next;
            size--;
            if (size == 0) {
                tail = null;
            }
        } else {
            System.out.println("Queue is empty. Cannot DeQueue!");
        }
        return firstElement;
    }

    /**
     * Time Complexity - O(1)
     * Space Complexity - O(1)
     * Looks at the node at the head of this queue without removing it from the queue.
     *
     * @return -1 if the queue is empty and if the queue is not empty,
     * return the element at the beginning of this queue
     */
    public int peek() {
        return isEmpty() ? -1 : head.value;
    }

    /**
     * Print all elements in a circular queue from front index to rear index
     * Time Complexity - O(N)
     * Space Complexity - O(1)
     */
    public void traverse() {
        if (!isEmpty()) {
            Node node = head;
            for (int i = 0; i < size; i++) {
                System.out.print(node.value);
                if (i < size - 1) {
                    System.out.print(" <- ");
                }
                node = node.next;
            }
            System.out.println();
        } else {
            System.out.println("Queue is empty. Cannot traverse!");
        }
    }

    /**
     * Delete this queue from memory
     * Time Complexity - O(1)
     * Space Complexity - O(1)
     */
    public void delete() {
        head = tail = null;
        System.out.println("Queue deleted successfully!");
    }
}
