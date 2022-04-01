import java.util.*;
  
public class StackDemo {
    public static void main(String args[])
    {
        Stack<Integer> stack = new Stack<Integer>();
  
        stack.add(35);
        stack.add(40);
        stack.add(55);
        stack.add(63);
        stack.add(70);
  
     
        System.out.println("Stack: " + stack);
        int rem_ele = stack.remove(0);
  
      
        System.out.println("Removed element: " + rem_ele);      
        System.out.println("Final Stack: " + stack);
                           
    }
}
