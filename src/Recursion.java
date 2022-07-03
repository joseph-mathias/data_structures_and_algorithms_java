/*
 * Recursion = when a thing is defined in terms of itself. -Wikipedia
 *              Apply the result of a procedure, to a procedure.
 *              A recursive method call itself. Can be a substitute for iteration.
 *              Divide a problem into sub-problems of the same type as the original
 *              Comonly used with advanced sorting algorithms and navigating trees
 * 
 * 
 *              Advantages
 *              easier to read/write
 *              easier to debug
 * 
 *              Disadvantages
 *              sometimes slower
 *              uses more memory
 */

public class Recursion {
    public static void main(String[] args) {
        walk(1000000);
        factorial(7);
        power(2, 9);
    }

    private static int power(int base, int exponent) {
        if(exponent < 1) return 1;
        return base * power(base, exponent - 1);//recursive
    }

    private static int factorial(int num) {
        if(num < 1) return 1;//base case
        return num * factorial(num - 1);//recursive
    }

    private static void walk(int steps) {
        if(steps < 1)return;
        System.out.println("You take a step!");

        walk(steps - 1);//recursive case
    }
    // private static void walk(int steps) {
    //     for (int i = 0; i < steps; i++) {
    //         System.out.println("You take a step!");
    //     }
    // }
    
}
