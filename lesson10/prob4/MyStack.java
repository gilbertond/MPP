/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.lesson10.prob4;

/**
 *
 * @author gilberto
 */
public class MyStack<T> {

    private T[] arr;
    private int size;
    private int top;

    public MyStack(int size) {
        this.size = size;
        arr = (T[]) new Object[size];
        top = -1;
    }

    public boolean isEmpty() {

        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public void push(T t) {

        if (size() == size) {
            return;
        }
        top++;
        arr[top] = t;

    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }

        T value = arr[top];
        top--;

        return value;
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }

        return arr[top];
    }

    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>(3);
        stack.push("Gilbert");
        stack.push("Ndenzi");
        stack.push("Hello");
        stack.peek();
        stack.pop();
        
        System.err.println("");
    }
}
