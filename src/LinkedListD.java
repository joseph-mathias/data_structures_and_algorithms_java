import java.util.LinkedList;
/*
 * Linklist = stores Nodes in 2 parts(data + address)
 * Nodes are in non-consecutive memory location
 * Elements are linked using pointers
 *                          singly Linked List
 *              Node            Node                Node
 *      [data | address] -> [data | address] -> [data | address]
 * 
 *                          Doubly Linked List
 *              Node            Node                Node
 *      [data | address] <-> [data | address] <-> [data | address] 
 * 
 * #ADVANTAGEs
 * dynamic data structure(allocates needed memory while running)
 * insertion and deletion of nodes is easy. O(1)
 * No/Low memory waste
 * 
 * #DISADVANTAGEs
 * Greater memory usage(addtional pointer)
 * no random access of elements (no index[2])
 * accessing/search elements is more time consuming. O(n)
 * 
 * #USES
 * implement Stack/Queues
 * GPS navigatio
 * music playlist
 */
public class LinkedListD {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("N");
        linkedList.push("M");
        linkedList.push("W");
        linkedList.pop();

        System.out.println(linkedList);

        linkedList.offer("Q");
        linkedList.offer("W");
        linkedList.offer("E");
        linkedList.offer("R");
        linkedList.offer("T");
        linkedList.offer("Y");
        linkedList.poll();

        System.out.println(linkedList);
    }
}
