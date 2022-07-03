import java.util.LinkedList;
import java.util.Queue;

/*
 * Queue - FIFO data Structures
 * A collection designed for holding elements prior to processing linear data structure
 * add = enqueue, offer()
 * remove = edqueue, poll()
 */
public class QueueD {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Herold");

        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();

        System.out.println(queue.peek());
        System.out.println(queue);
        // queue.isEmpty()
        // queue.size()
        // queue.contains()
    }
}

/*
 * Keyboard buffer(letters should appear on screen in the order they're pressed)
 * printer Queue(print jobs should be complemeted in order)
 * used in linkedList, priorityQueues, Breadth-first search
 */