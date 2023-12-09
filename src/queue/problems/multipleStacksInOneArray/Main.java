package src.queue.problems.multipleStacksInOneArray;

public class Main {
    public static void main(String[] args) {
        MultipleStacksInOneArray multiStack = new MultipleStacksInOneArray(4);
        multiStack.push(1, 0);
        multiStack.push(2, 0);
        multiStack.push(3, 0);
        multiStack.push(4, 0);
        multiStack.push(5, 0);
        multiStack.pop(0);
        multiStack.pop(0);
        multiStack.push(4, 0);
        multiStack.push(7, 1);
        multiStack.push(8, 1);
        multiStack.push(9, 1);
        multiStack.push(10, 1);
        multiStack.push(11, 1);
        multiStack.push(5, 2);
        multiStack.push(15, 2);
        multiStack.push(25, 2);
        multiStack.push(35, 2);
        multiStack.push(45, 2);
        multiStack.push(6, 3);
        multiStack.push(16, 3);
        multiStack.push(26, 3);
        multiStack.push(36, 3);
        multiStack.push(46, 3);
        multiStack.pop(1);
        multiStack.traverseEntireArrayStack();
        System.out.println("Peek Stack 0: " + multiStack.peek(0));
        System.out.println("Peek Stack 1: " + multiStack.peek(1));
        System.out.println("Peek Stack 2: " + multiStack.peek(2));
        System.out.println("Peek Stack 3: " + multiStack.peek(3));
        System.out.println("Peek Stack 4: " + multiStack.peek(4));
    }
}
