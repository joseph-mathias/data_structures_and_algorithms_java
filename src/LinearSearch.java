/*
 * linear search - iterate through a collection one elements at a time
 *                  runtime complexity: O(n)
 * 
 *                  Disadvantages:
 *                  slow for large data sets
 * 
 *                  Advantages:
 *                  fast for search of small to medium data sets
 *                  does not need to be sorted
 *                  useful for data structures that do not have random access (Linked List)
 */


public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {9,7,3,6,1,8,2,5};
        int index = linearSearch(array, 5);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found!");
        }
    }

    public static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
