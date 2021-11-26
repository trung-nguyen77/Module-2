package bai11_Quece_Stack.Bt1_Reverse_Element;

import java.util.LinkedList;

public class MyList<T> {
    private LinkedList<T> stack;
    public static final int DEFAULT_CAPACITY = 6;

    public MyList() {
       stack = new LinkedList<>();
    }
    public void add(T element) {
        if (!isFull()) {
            stack.addFirst(element);
        } else {
            System.out.println("Memory Full");
        }
    }
    public boolean isFull(){
        if (stack.size() == DEFAULT_CAPACITY) {
            return true;
        }
        return false;
    }
    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
    public void pop() {
        if (!isEmpty()) {
            stack.removeFirst();
        } else {
            System.out.println("Empty!");
        }
    }
    public void show() {
        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.get(i));
        }
    }

    public int size() {
        return stack.size();
    }

    public static void main(String[] args) {
        MyList<String> stack = new MyList();
        stack.add("!");
        stack.add("r");
        stack.add("e");
        stack.add("p");
        stack.add("u");
        stack.add("S");
        System.out.println();
        stack.show();
        System.out.println("1.1 Size of stack after push operations: " + stack.size());
        stack.pop();
        System.out.println("1.1 Size of stack after push operations: " + stack.size());
        stack.show();


    }
}
