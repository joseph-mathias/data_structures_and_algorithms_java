/*
 * Bubble sort = pairs of adjacent elements are compared, and the elements
 *               swapped if they are not in order.
 * 
 *              Quadratic time O(n^2);
 *              small data set = Oaky-ish
 *              large data set = BAD (Plz don't)
 */
public class BobbleSort {
    public static void main(String[] args) {
        int array[] = {9, 7, 8, 5, 3, 5, 2, 1};
        bobbleSort(array);

        for(int i : array){
            System.out.println(i);
        }
    }

    private static void bobbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
