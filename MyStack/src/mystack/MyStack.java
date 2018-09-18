package mystack;

public class MyStack {

    private char[] data = new char[10];// declare array
    private int top = -1;// inisialise the "spring" as -1 to indicate that tther e is no "plates left"

    public void push(char c) {
        top = top + 1;//++top -- incrase the top vlaue
        data[top] = c;// set top value to the stack
    }

    public char pop() {// release the top value of the stack
        return data[top--];
    }

    public boolean isEmty() {// tells when the stack is emty 
        return top == -1;
    }
    public boolean isFull(){
    return (top==data.length-1);
    }

    public static void main(String[] args) {
        MyStack ms = new MyStack();
        ms.push('P');// adding new "plate to stack"
        ms.push('u');
        ms.push('s');
        ms.push('h');

       while (!ms.isEmty()) {// printing stack
            char value = ms.pop();
            System.out.println(value);
           System.out.print("");
        }
       System.out.println(" ");
    }

}
