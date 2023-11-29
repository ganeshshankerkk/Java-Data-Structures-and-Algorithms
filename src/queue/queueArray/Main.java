package src.queue.queueArray;

public class Main {
    public static void main(String[] args) {
        //Creation of queue with the given size
        QueueArray queue = new QueueArray(3);
        //Validates if the queue is empty
        System.out.println("Is Empty: " + queue.isEmpty());
        //Addition of elements to the beginning of the queue
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        //Validates if the queue is full
        System.out.println("Is Full: " + queue.isFull());
        System.out.println("Is Empty: " + queue.isEmpty());
        //Prints the beginning element of the queue to the console
        System.out.println("Peek: " + queue.peek());
        //Removes the element at the beginning of this queue and prints that element to the console
        System.out.println("DeQueue: " + queue.deQueue());
        System.out.println("Peek: " + queue.peek());
        System.out.println("DeQueue: " + queue.deQueue());
        System.out.println("DeQueue: " + queue.deQueue());
        //Delete the queue from memory
        queue.delete();
        System.out.println("Peek: " + queue.peek());
        System.out.println("DeQueue: " + queue.deQueue());
        System.out.println("Is Full: " + queue.isFull());
        System.out.println("Is Empty: " + queue.isEmpty());
    }
}
