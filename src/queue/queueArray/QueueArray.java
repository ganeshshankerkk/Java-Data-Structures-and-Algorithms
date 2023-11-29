package src.queue.queueArray;

public class QueueArray {
    int[] arr;
    int top;
    int beginning;

    /**
     * Time Complexity - O(1)
     * Space Complexity - O(N)
     *
     * @param size : Size of the queue array
     */
    public QueueArray(int size) {
        this.arr = new int[size]; //O(1)
        this.top = this.beginning = -1; //O(1)
        System.out.println("The Queue is successfully created with the size " + size); //O(1)
    }

    /**
     * Time Complexity - O(1)
     * Space Complexity - O(1)
     *
     * @return true if this queue is full and false otherwise
     */
    public boolean isFull() {
        return this.arr != null ? (this.top == this.arr.length - 1) : Boolean.FALSE; //O(1)
    }

    /**
     * Time Complexity - O(1)
     * Space Complexity - O(1)
     *
     * @return true if this queue is empty and false otherwise
     */
    public boolean isEmpty() {
        return this.arr == null || this.beginning == -1 || this.beginning == this.arr.length; //O(1)
    }

    /**
     * Insert given element to the queue
     * Time Complexity - O(1)
     * Space Complexity - O(1)
     *
     * @param value : value to be inserted to the queue
     */
    public void enQueue(int value) {
        if (isFull()) { //O(1)
            System.out.println("Queue is already full"); //O(1)
        } else if (isEmpty()) { //O(1)
            this.beginning = 0; //O(1)
            this.top++; //O(1)
            this.arr[top] = value; //O(1)
            System.out.println(value + " inserted to queue successfully!"); //O(1)
        } else {
            this.top++; //O(1)
            this.arr[top] = value; //O(1)
            System.out.println(value + " inserted to queue successfully!"); //O(1)
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
        int firstElementInQueue = -1; //O(1)
        if (isEmpty()) { //O(1)
            System.out.println("Queue is empty"); //O(1)
        } else {
            firstElementInQueue = this.arr[this.beginning]; //O(1)
            this.beginning++; //O(1)
            if (this.beginning > this.top) { //O(1)
                this.beginning = this.top = -1; //O(1)
            }
        }
        return firstElementInQueue; //O(1)
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
        return isEmpty() ? -1 : this.arr[this.beginning]; //O(1)
    }

    /**
     * Delete this queue from memory
     * Time Complexity - O(1)
     * Space Complexity - O(1)
     */
    public void delete() {
        this.arr = null; //O(1)
        this.beginning = this.top = -1; //O(1)
        System.out.println("Queue deleted successfully"); //O(1)
    }

}
