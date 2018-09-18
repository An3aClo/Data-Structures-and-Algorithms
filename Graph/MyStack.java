/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wg;

/**
 *
 * @author MakhuraneT
 */
public class MyStack {
    private int[] data;
    private int top;
    
    public MyStack(int size) {
        data = new int[size];
        top = -1;
    }
    
    public void push(int val) {
        data[++top] = val;
    }
    
    public int pop() {
        int val = data[top];
        top--;
        return val;
    }
    
    public int peek() {
        return data[top];
    }
    
    public boolean isEmpty() {
        return (top == -1);
    }
    
    public boolean isFull() {
        return (top == data.length - 1);
    }
    
}
