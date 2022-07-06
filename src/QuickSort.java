/*
 * Quick sort = moves smaller elements to left of a pivot.
 *              recursively divide array in 2 partitions
 * 
 * Run Time complexity = Best case O(n log(n))
 *                       Average case O(n long(n))
 *                      Worst case O(n^2) if already sorted
 * 
 * space complexity = O(log(n)) due to recursion
 */

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {3, 6, 7, 9, 1, 5, 0, 4, 20, 2, 8};

        quickSort(array, 0, array.length - 1);
        for(int i : array){
            System.out.print(i + " ");
        }
    }

    private static void quickSort(int[] array, int start, int end) {
        if(end <= start) return; //base case

        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);
    }

    private static int partition(int[] array, int start, int end) {

        int pivot = array[end];
        int i = start - 1;

        for (int j = start; j <= end - 1; j++) {
            if(array[j] < pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }
}
