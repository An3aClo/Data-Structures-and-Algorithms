package stackofdogs;

public class StackOfDogs {

    private Dogs[] dog = new Dogs[10];
    int top = -1;

    public void push(Dogs a) {
        dog[++top] = a;
    }

    public Dogs pop() {
        return dog[top--];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == dog.length - 1);
    }

    public static void main(String[] args) {

    }

}
