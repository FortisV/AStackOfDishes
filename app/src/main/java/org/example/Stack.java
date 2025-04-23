package org.example;


import java.util.EmptyStackException;

public class Stack<T> {
    final public int max_stack = 5;
    private int size;
    private T[] array;
    Stack() {
        size = 0;
        array = (T[]) new Object[max_stack];
    }
    void push(T data) {
        if(full()) {
            System.out.println("Stack is full");
        } else {
            array[size++] = data;
        }
    }
    T pop() {
        if(size == 0) {
            throw new EmptyStackException();
        }
        return array[--size];
    }
    T peek() {
        return array[size - 1];
    }
    int size() {
        return size;
    }
    void clear() {
        size = 0;
    }
    boolean full() {
        return size == max_stack;
    }
}
