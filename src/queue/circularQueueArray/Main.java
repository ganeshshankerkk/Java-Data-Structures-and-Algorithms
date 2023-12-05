package src.queue.circularQueueArray;

public class Main {
    public static void main(String[] args) {
        CircularQueueArray circularQueue = new CircularQueueArray(3);
        circularQueue.traverse();

        System.out.println("Peek: " + circularQueue.peek());
        System.out.println("is empty: " + circularQueue.isEmpty());
        System.out.println("is full: " + circularQueue.isFull());

        circularQueue.enQueue(1);
        circularQueue.traverse();
        circularQueue.enQueue(2);
        circularQueue.enQueue(3);
        circularQueue.enQueue(4);
        circularQueue.traverse();

        System.out.println("Peek: " + circularQueue.peek());
        System.out.println("is full: " + circularQueue.isFull());
        System.out.println("Dequeue: " + circularQueue.deQueue());
        System.out.println("Dequeue: " + circularQueue.deQueue());

        circularQueue.traverse();
        System.out.println("is full: " + circularQueue.isFull());

        circularQueue.enQueue(4);
        circularQueue.traverse();
        circularQueue.enQueue(5);
        circularQueue.traverse();

        System.out.println("Dequeue: " + circularQueue.deQueue());
        circularQueue.traverse();
        System.out.println("Dequeue: " + circularQueue.deQueue());
        circularQueue.traverse();
        System.out.println("Dequeue: " + circularQueue.deQueue());

        circularQueue.traverse();
        System.out.println("is empty: " + circularQueue.isEmpty());
        System.out.println("is full: " + circularQueue.isFull());
    }
}
