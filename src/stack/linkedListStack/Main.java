package src.stack.linkedListStack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println("Is Empty: " + stack.isEmpty());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Peek Stack: " + stack.peek());
        stack.pop();
        System.out.println("Peek Stack: " + stack.peek());
        System.out.println("Is Empty: " + stack.isEmpty());
        stack.deleteStack();
        stack.peek();
        System.out.println("Is Empty: " + stack.isEmpty());
    }
}
