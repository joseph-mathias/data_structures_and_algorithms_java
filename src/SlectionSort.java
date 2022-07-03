/**
 * Selection sort - search through an array and keep track of the minimun value during
 *                  each iteration. At the end of each iteration, we swap variables
 * 
 *                  Quadratric time O(n^2)
 *                  small data set = Okay
 *                  large data set = BAD
 */
public class SlectionSort {
    public static void main(String[] args) {
        int[] array = {6,9,0,2,5,7,8,4,3,1};
        
        selectionSort(array);
        for(int i : array){
            System.out.println(i);
        }
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if(array[min] > array[j]){
                    min = j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
