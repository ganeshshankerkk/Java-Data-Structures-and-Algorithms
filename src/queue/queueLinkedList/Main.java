package src.queue.queueLinkedList;

public class Main {
    public static void main(String[] args) {
        QueueLinkedList queue = new QueueLinkedList();
        System.out.println("Is Empty: " + queue.isEmpty());
        queue.enQueue(1);
        System.out.println("Is Empty: " + queue.isEmpty());
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.traverse();
        System.out.println("Peek: " + queue.peek());
        System.out.println("DeQueue: " + queue.deQueue());
        queue.traverse();
        System.out.println("Peek: " + queue.peek());

        System.out.println("DeQueue: " + queue.deQueue());
        queue.traverse();
        System.out.println("Peek: " + queue.peek());

        System.out.println("DeQueue: " + queue.deQueue());
        queue.traverse();
        System.out.println("Peek: " + queue.peek());

        System.out.println("DeQueue: " + queue.deQueue());
        System.out.println("Peek: " + queue.peek());

        queue.traverse();
        queue.delete();
        queue.traverse();
        System.out.println("Is Empty: " + queue.isEmpty());
    }
}
