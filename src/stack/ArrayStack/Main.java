package src.stack.ArrayStack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(4);
        System.out.println("Is Empty: " + stack.isEmpty());
        System.out.println("Is Full: " + stack.isFull());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("Is Empty: " + stack.isEmpty());
        System.out.println("Is Full: " + stack.isFull());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.delete();
        System.out.println(stack.peek());
    }
}
