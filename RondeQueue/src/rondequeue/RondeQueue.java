package rondequeue;

public class RondeQueue {

    public static void main(String[] args) {

        MyQueue mq = new MyQueue(7);
        mq.enqueue(5);
        mq.enqueue(8);
        mq.enqueue(4);
        mq.enqueue(3);
        mq.enqueue(1);
        mq.enqueue(9);
        mq.enqueue(6);
        System.out.println("The original queue");
        mq.print();
        System.out.println();

        System.out.println(mq.dequeue() + "Dequeue");
        System.out.println(mq.dequeue() + "Dequeue");
        System.out.println();
        System.out.println("Queue with empty spaces");
        mq.print();
        mq.enqueue(40);
        mq.enqueue(50);
        System.out.println();
        System.out.println("The new queue");
        mq.print();        
    }
}

class MyQueue {

    private int front, rear, count;
    private int[] data;
 
    public MyQueue(int n) {
        data = new int[n];
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

    public void enqueue(int val) {
        data[rear] = val;
        rear = (rear + 1) % data.length;
        count++;
    }

    public int dequeue() {
        int value = data[front + 1];
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
