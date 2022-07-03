import java.util.ArrayList;
import java.util.LinkedList;

public class LAComparison {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;

        for (int i = 0; i < 10000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        // ****************************LINKEDLIST***************************
        startTime = System.nanoTime();

        linkedList.get(4445);
        linkedList.remove(3);

        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;

        System.out.println("LinkedList:\t" + elapsedTime + "ns");

        // ****************************ARRAYLIST***************************
        startTime = System.nanoTime();

        arrayList.get(4445);
        linkedList.remove(3);
        
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;

        System.out.println("ArrayList:\t" + elapsedTime + "ns");
    }
}
