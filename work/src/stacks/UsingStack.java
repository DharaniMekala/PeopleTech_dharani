/*
 * package stacks; import java.util.Stack;
 * 
 * public class UsingStack { int stack[] = new int[6]; int start = 0;
 * 
 * public void push(int data) {
 * 
 * stack[start] = data; start++; }
 * 
 * public int pop() { int data; start--; data = stack[start]; stack[start] = 0;
 * return data;
 * 
 * }
 * 
 * public int peak() {
 * 
 * int data; data = stack[start - 1]; return data; }
 * 
 * public void print() {
 * 
 * for (int i = 0; i < stack.length; i++) {
 * 
 * System.out.print(stack[i] + " -> "); } }
 * 
 * public static void main(String[] args) { UsingStack stack = new UsingStack();
 * 
 * stack.push(1); stack.push(2); stack.push(3); stack.push(4); stack.push(5); //
 * stack.push(6); System.out.println("Push Methhod.."); stack.print();
 * System.out.println("\n Pop Methhod.."); System.out.println(stack.pop());
 * 
 * System.out.println("Peak Method"); System.out.println(stack.peak());
 * 
 * System.out.println("Searching element "); System.out.println(Stack.search(
 * 4)); }
 * 
 * 
 * }
 */
package stacks; 
import java.io.*;
import java.util.*;
 
public class UsingStack
{  
    static void stack_push(Stack<Integer> stack)
    {
        for(int i = 0; i < 5; i++)
        {
            stack.push(i);
        }
    }
    static void stack_pop(Stack<Integer> stack)
    {
        System.out.println("Pop Operation:");
 
        for(int i = 0; i < 5; i++)
        {
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        }
    }
    static void stack_peek(Stack<Integer> stack)
    {
        Integer element = (Integer) stack.peek();
        System.out.println("Element on stack top: " + element);
    }
    static void stack_search(Stack<Integer> stack, int element)
    {
        Integer pos = (Integer) stack.search(element);
 
        if(pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position: " + pos);
    }
 
 
    public static void main (String[] args)
    {
        Stack<Integer> stack = new Stack<Integer>();
 
        stack_push(stack);
        stack_pop(stack);
        stack_push(stack);
        stack_peek(stack);
        stack_search(stack, 2);
        stack_search(stack, 6);
    }
}