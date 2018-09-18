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
public class MyQueue {

    private int front;
    private int rear;
    private int count;
    private int[] data;

    public MyQueue(int n) {
        data = new int[n];
        front = 0;
        rear = 0;
        count = 0;
    }

    public boolean isEmpty() {
        return (count == 0);
    }

    public boolean isFull() {
        return (count == data.length);
    }

    public void enqueue(int value) {
        data[rear] = value;
        rear = (rear + 1) % data.length;
        count++;
    }

    public int dequeue() {
        int value = data[front];
        front = (front + 1) % data.length;
        count--;
        return value;
    }

    public void display() {
        int cursor = front;
        for (int counter = 0; counter < count; counter++) {
            System.out.print("" + data[cursor] + ", ");
            cursor = (cursor + 1) % data.length;
        }
        System.out.println("");
    }

}