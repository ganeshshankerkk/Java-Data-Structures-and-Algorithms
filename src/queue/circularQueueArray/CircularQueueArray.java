package src.queue.circularQueueArray;

public class CircularQueueArray {
    int[] arr;
    int front;
    int rear;

    /**
     * Creates a circular queue with the given size
     * Time Complexity - O(1)
     * Space Complexity - O(N)
     *
     * @param size : Size of the queue array
     */
    public CircularQueueArray(int size) {
        arr = new int[size];
        front = rear = -1; //O(1)
        System.out.println("Circular queue is successfully created with the size " + size); //O(1)
    }

    /**
     * Time Complexity - O(1)
     * Space Complexity - O(1)
     *
     * @return true if this queue is empty and false otherwise
     */
    public boolean isEmpty() {
        return arr == null || rear == -1 || front == -1; //O(1)
    }

    /**
     * Time Complexity - O(1)
     * Space Complexity - O(1)
     *
     * @return true if this queue is full and false otherwise
     */
    public boolean isFull() {
        return (front == 0 && rear == arr.length - 1) || (front == (rear + 1) % arr.length);  //O(1)
    }

    /**
     * Insert given element to the queue
     * Time Complexity - O(1)
     * Space Complexity - O(1)
     *
     * @param value : value to be inserted to the queue
     */
    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("Queue is already full. Cannot insert element " + value + " to the queue"); //O(1)
        } else if (isEmpty()) {
            rear++; //O(1)
            front = 0; //O(1)
            arr[rear] = value; //O(1)
            System.out.println(value + " inserted to circular queue successfully!"); //O(1)
        } else {
            rear = (rear + 1) % arr.length; //O(1)
            arr[rear] = value; //O(1)
            System.out.println(value + " inserted to circular queue successfully"); //O(1)
        }
    }

    /**
     * Removes the element at the beginning of this queue
     * and returns that element as the value of this function.
     * Time Complexity - O(1)
     * Space Complexity - O(1)
     *
     * @return The element at the beginning of this queue
     */
    public int deQueue() {
        int firstElement = -1; //O(1)
        if (isEmpty()) {
            System.out.println("Circular Queue is empty. Cannot deQueue elements"); //O(1)
        } else {
            firstElement = arr[front]; //O(1)
            arr[front] = -1; //O(1)
            if (front == rear) { // There is only one element in the circular queue  //O(1)
                front = rear = -1; //O(1)
            } else {
                front = (front + 1) % arr.length; //O(1)
            }
        }
        return firstElement;
    }

    /**
     * Time Complexity - O(1)
     * Space Complexity - O(1)
     * Looks at the object at the beginning of this queue without removing it from the queue.
     *
     * @return -1 if the queue is empty and if the queue is not empty,
     * return the element at the beginning of this queue
     */
    public int peek() {
        return isEmpty() ? -1 : arr[front];  //O(1)
    }

    /**
     * Delete this queue from memory
     * Time Complexity - O(1)
     * Space Complexity - O(1)
     */
    public void delete() {
        this.arr = null; //O(1)
        this.front = this.rear = -1; //O(1)
        System.out.println("Circular queue deleted successfully"); //O(1)
    }

    /**
     * Print all elements in a circular queue from front index to rear index
     */
    public void traverse() {
        if (isEmpty()) {
            System.out.println("Circular queue is empty. Cannot traverse");
        } else {
            System.out.print("[");
            if (rear >= front) {
                // Print elements from front to rear.
                for (int i = front; i <= rear; i++) {
                    System.out.print(arr[i]);
                    if (i < rear) {
                        System.out.print("  <---  ");
                    }
                }
            }
            // If rear crossed the max index and indexing has started in loop
            else {
                for (int i = front; i < arr.length; i++) {
                    System.out.print(arr[i]);
                    if (i < arr.length) {
                        System.out.print("  <---  ");
                    }
                }
                // Printing elements from 0th index till rear
                for (int i = 0; i <= rear; i++) {
                    System.out.print(arr[i]);
                    if (i < rear) {
                        System.out.print("  <---  ");
                    }
                }
            }
            System.out.print("]" + "\n");
        }
    }
}
