import java.util.PriorityQueue;
import java.util.Queue;
/*
 * Priority Queue - FIFO data Structure that serves elements
 * with the highest priorities first
 * before elements with lower priority
 */
public class PriorityQueueD {
    public static void main(String[] args) {
        Queue<Double> queue = new PriorityQueue<Double>(); //Collections.reveserOrder()
    
        queue.offer(2.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(3.0);
        queue.offer(6.0);

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
