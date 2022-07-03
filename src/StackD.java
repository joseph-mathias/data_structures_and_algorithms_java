import java.util.Stack;
/**
 * stack is a LIFO data structure
 * stores objects into a sort of "vertical tower"
 * push() to and to the top
 * pop() to remove from the top
 */
public class StackD{
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();


        // System.out.println(stack.empty());

        // adds to the top of stack
        stack.push("Java");
        stack.push("JavaScript");
        stack.push("Python");
        stack.push("C#");
        stack.push("C");
        stack.push("C++");

        // viewing the top most 
        stack.peek();
        // check if its empty
        System.out.println(stack.empty());

        // removes from the top
        stack.pop();

        // remove and assgin it
        String myFavLang = stack.pop();
        System.out.println(myFavLang);

        // returns -1 if not found
        stack.search("Java");
    }
}

/**
 * uses of stack
 * -undo/redo feactures in text editors
 * -moving back/forward through browser history
 * -backtracking algorithms(maze, file directory)
 * -calling functions (call stack)
 */