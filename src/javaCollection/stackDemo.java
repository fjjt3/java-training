package javaCollection;

import java.util.Stack;

public class stackDemo {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>(); // define stack for int type
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);
        System.out.println("The stack size: " + myStack.size());
        System.out.println("The top element: " + myStack.peek());

        while (!myStack.isEmpty()){// until the stack is not empty, pop  and print elements
            System.out.println("Popped Item" + myStack.pop());
        }
    }
}
