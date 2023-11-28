package src.stack.linkedListStack;

public class Stack {
    LinkedList linkedList;

    public Stack() {
        linkedList = new LinkedList();
    }

    /**
     * Time Complexity= O(1)
     * Space Complexity = O(1)
     *
     * @param value value to inserted to the head of
     *              the stack
     */
    public void push(int value) {
        linkedList.insert(value, 0); // O(1)
        System.out.println("Inserted " + value + " in stack"); // O(1)
    }

    /**
     * Time Complexity= O(1)
     * Space Complexity = O(1)
     *
     * @return true if this stack is empty
     * and false otherwise
     */
    public boolean isEmpty() {
        return linkedList.head == null; // O(1)
    }

    /**
     * Removes the element at the top of this stack and returns that element as the value of this function.
     * Time Complexity = O(1)
     * Space Complexity = O(1)
     *
     * @return The element at the top of this stack
     */
    public int pop() {
        int result = -1; // O(1)
        if (!isEmpty()) { // O(1)
            result = this.linkedList.head.value; // O(1)
            linkedList.delete(0); // O(1)
        } else {
            System.out.println("The stack is empty"); // O(1)
        }
        return result; // O(1)
    }

    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     * Time Complexity = O(1)
     * Space Complexity = O(1)
     *
     * @return the element at the top of this stack
     */
    public int peek() {
        if (!isEmpty()) { // O(1)
            return this.linkedList.head.value;// O(1)
        } else {
            System.out.println("The stack is empty"); // O(1)
            return -1; // O(1)
        }
    }

    /**
     * Delete this stack from memory
     * Time Complexity = O(1)
     * Space Complexity = O(1)
     */
    public void deleteStack() {
        linkedList.head = null; // O(1)
        System.out.println("The stack is deleted successfully!"); // O(1)
    }

}
