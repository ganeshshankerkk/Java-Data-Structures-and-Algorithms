package src.stack.arrayStack;

/**
 * Stack creation using Arrays
 */
public class Stack {
    int[] arr;
    int topOfStack;

    /**
     * Time Complexity = O(1)
     * Space Complexity = O(N)
     *
     * @param size size of the stack
     */
    public Stack(int size) {
        this.arr = new int[size]; //O(1)
        this.topOfStack = -1; //O(1)
        System.out.println("The stack is created with size " + size); //O(1)
    }

    /**
     * Time Complexity = O(1)
     * Space Complexity = O(1)
     *
     * @return true if topOfStack is -1 and false otherwise
     */
    public boolean isEmpty() {
        return topOfStack == -1 ? Boolean.TRUE : Boolean.FALSE; //O(1)
    }

    /**
     * Time Complexity = O(1)
     * Space Complexity = O(1)
     *
     * @return true if stack is full and false otherwise
     */
    public boolean isFull() {
        return topOfStack == this.arr.length - 1 ? Boolean.TRUE : Boolean.FALSE; //O(1)
    }

    /**
     * Pushes an item onto the top of this stack.
     * Time Complexity = O(1)
     * Space Complexity = O(1)
     *
     * @param value - the item value to be pushed onto this stack.
     */
    public void push(int value) {
        if (isFull()) { //O(1)
            System.out.println("The stack is already full!"); //O(1)
        } else {
            this.arr[this.topOfStack + 1] = value; //O(1)
            this.topOfStack++; //O(1)
            System.out.println(value + " inserted to the stack successfully!"); //O(1)
        }
    }

    /**
     * Removes the element at the top of this stack and returns that element as the value of this function.
     * Time Complexity = O(1)
     * Space Complexity = O(1)
     *
     * @return The element at the top of this stack
     */
    public int pop() {
        if (isEmpty()) { //O(1)
            System.out.println("The stack is empty!"); //O(1)
            return -1; //O(1)
        } else {
            int topStack = arr[topOfStack]; //O(1)
            this.topOfStack--; //O(1)
            return topStack; //O(1)
        }
    }

    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     * Time Complexity = O(1)
     * Space Complexity = O(1)
     *
     * @return the element at the top of this stack
     */
    public int peek() {
        if (isEmpty()) { //O(1)
            System.out.println("The stack is empty!"); //O(1)
            return -1; //O(1)
        } else {
            return arr[topOfStack]; //O(1)
        }
    }

    /**
     * Delete this stack from memory
     * Time Complexity = O(1)
     * Space Complexity = O(1)
     */
    public void delete() {
        this.arr = null; //O(1)
        this.topOfStack = -1; //O(1)
        System.out.println("The stack is deleted successfully!"); //O(1)
    }
}
