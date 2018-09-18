/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackofdinosaurs;

/**
 *
 * @author andre
 */
public class StackOfDinosaurs {

    private Dinosaur[] data = new Dinosaur[10];
    private int top = -1;

    public void push(Dinosaur c) {

        data[++top] = c;
    }

    public Dinosaur pop() {
        return data[top--];
    }

//    public long peek(){
//        return data[top];
//    }
    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == data.length - 1);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StackOfDinosaurs stack = new StackOfDinosaurs();

        Dinosaur cbt = new Dinosaur("emildesour", "Andrewsour");

        stack.push(cbt);
        stack.push(new Dinosaur("Stetorsoaur", "Megasour"));

        while (!stack.isEmpty()) {
            Dinosaur c = stack.pop();
            System.out.println(c.toString());

        }

        System.out.println(" ");
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
        // TODO code application logic here
    }

}
