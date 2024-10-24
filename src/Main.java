import com.data.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

       ArrayStack<Integer> stack = new ArrayStack<>(10);

       stack.push(1);
       stack.push(2);
       stack.push(3);

       ArrayStack<Integer> stack1 = new ArrayStack<>(10);

       System.out.println("Size: " + stack.size());
       stack.traverse();

       stack1.transfer(stack);
       stack1.traverse();

       stack1.removeAll();
       System.out.println("Size: " + stack1.size());
       stack1.traverse();

    }
}