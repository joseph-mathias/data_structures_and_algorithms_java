import java.util.Hashtable;
/*
 * Hashtable = A data structure that stores unqiue keys to values eg. <Integer, String>
 *              each key/value pair is know as Entry
 *              fast insertion, look up deletion of key/value pairs
 *              not ideal for small data sets, great with large data sets
 * hashing = takes a key and computes an integer (formula will vary based on key & data type)
 *            In a hashtable, we use the hash % capacity to calculate an index number
 *              
 *              key.hash() % capacity = index
 * 
 * bucket = an indexes storage location for one or more Entries
 *          can store multiple entries in case of a collision (linked similiarly a linkedlist)
 *          
 * collision = hash function generates the same index for more than one key less collision = more efficiency
 * 
 * Runtime complexity: Best Case O(1)
 *                     Worst Case O(n)
 */
public class HashtableD {
    public static void main(String[] args) {

        // Hashtable<Integer, String> table = new Hashtable<Integer, String>(10);
        Hashtable<String, String> table = new Hashtable<>(10);
        
        table.put("100", "Spongebob");
        table.put("123", "Patrick");
        table.put("321", "Gary");
        table.put("555", "Squidward");
        table.put("777", "Sandy");

        // table.remove(777);
        for(String key : table.keySet()){
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
            // System.out.println(key + "\t" + table.get(key));
        }
    }
}
