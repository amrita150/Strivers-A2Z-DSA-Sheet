import java.util.*;

class stack {
    int size = 10000;
    int arr[] = new int[size];
    int top = -1;
    void push(int x) {
        top++;
        arr[top] = x;
    }
    int pop() {
        int x = arr[top];
        top--;
        return x;
    }
    int top() {
        return arr[top];
    }
    int size() {
        return top + 1;
    }
}

public class StackUsingArray {

    public static void main(String[] args) {

        stack s = new stack();
        s.push(6);
        s.push(3);
        s.push(7);
        System.out.println("Top of the stack  " + s.top());
        System.out.println("Size of the stack  " + s.size());
        System.out.println("The element deleted is  " + s.pop());
        System.out.println("Size of the stack after  " + s.size());
        System.out.println("Top of the stack after  " + s.top());
    }
}