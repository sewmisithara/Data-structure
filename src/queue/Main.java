package queue;



public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);
        queue.enQueue(60);

        queue.printQueue(); //[10, 20, 30]

        System.out.println("deQueued: " + queue.deQueue());
        queue.printQueue(); //[20, 30]

        System.out.println("Peeked: " + queue.peek()); //20
    }
}
