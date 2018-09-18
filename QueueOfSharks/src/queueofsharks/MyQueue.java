package queueofsharks;

public class MyQueue {
   

    private int front, rear, count;
    private Shark[] data;
 
    public MyQueue(int n) {
        data = new Shark[n];
        front = 0;
        rear = 0;
        count = 0;
    }

    public boolean isEmty() {
        return (count == 0);
    }

    public boolean isFull() {
        return (count == data.length);
    }

    public void enqueue(Shark val) {
        data[rear] = val;
        rear = (rear + 1) % data.length;
        count++;
    }

    public Shark dequeue() {
        Shark value = data[front + 1];
        front = (front + 1) % data.length;
        count--;
        return value;
    }

    public void print() {

        for (int i = 0; i < data.length; i++) {
            if (i == front) {
                System.out.println(data[i] + "(f), ");
            } else if (i == rear) {
                System.out.println(data[i] + "(r), ");
            } else {
                System.out.println(data[i] + ", ");
            }
        }
        /* int cursor = front;
        while (cursor != rear - 1) {
            System.out.println(" "+data[cursor]);
            cursor=(cursor+1)%data.length;
        }
        System.out.println(" ");*/
    }
}


