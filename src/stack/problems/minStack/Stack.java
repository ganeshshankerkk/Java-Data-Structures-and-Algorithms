package src.stack.problems.minStack;

/**
 * Design a stack which, in addition to push, pop, and top,
 * has a function min which returns the minimum element.
 * Push, pop, top and min should all operate in O(1).
 */
public class Stack {
    private Node top;
    private Node min;

    public Stack() {
        top = min = null;
    }

    public int min() {
        return min != null ? min.value : -1;
    }

    public void push(int value) {
        if (min == null) {
            min = new Node(value, null);
        } else if (min.value < value) {
            min = new Node(min.value, min);
        } else {
            min = new Node(value, min);
        }
        top = new Node(value, top);
    }

    public int pop() {
        min = min.next;
        int result = top.value;
        top = top.next;
        return result;
    }

    public int top() {
        return top != null ? top.value : -1;
    }

    /**
     public void traverse() {
     Node tempNode = top;
     System.out.print("Main Stack: ");
     while (tempNode != null) {
     System.out.print(tempNode.value + " ");
     tempNode = tempNode.next;
     }
     System.out.println();
     }

     public void traverseMin() {
     Node tempNode = min;
     System.out.print("MIN Stack: ");
     while (tempNode != null) {
     System.out.print(tempNode.value + " ");
     tempNode = tempNode.next;
     }
     System.out.println();
     }
     */
}
