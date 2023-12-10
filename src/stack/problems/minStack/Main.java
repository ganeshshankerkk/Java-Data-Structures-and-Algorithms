package src.stack.problems.minStack;

public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(3);
        stack.push(21);
        stack.push(2);
        stack.push(13);
        stack.push(1);
        System.out.println("Top: " + stack.top());
        System.out.println("Min element: " + stack.min());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Min element: " + stack.min());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Min element: " + stack.min());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Min element: " + stack.min());
    }
}
