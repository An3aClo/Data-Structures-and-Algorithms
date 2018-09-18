/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heapsort;

import java.util.Scanner;

/**
 *
 * @author andrea
 */
public class HeapS {

    private int[] data;
    private int n;

    public HeapS() {
        data = null;
        n = 0;
    }

    public void getInput() {
        System.out.println("How many number ? ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        data = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number");
            data[i] = in.nextInt();
        }
    }

    public void sort() {
        buildHeap();
        heapSort();
    }

    public void sift(int v) {
        //left hand child
        //it will always be  w=2*v+1; to acces the left child

        int w = 2 * v + 1;
        //right childw+1
        //  w + 1
        while (w < n) {
            if (w + 1 < n) {
                if(data[w]<data[w+1])
                
                    w++;
                
            }
            if (data[v] < data[w]) {
                int temp = data[w];
                data[w] = data[v];
                data[v] = temp;
            }
            v = w;
            w = 2 * v + 1;
        }
    }

    public void buildHeap() {
        for (int i = n / 2 - 1; i >= 0; i++) {
            sift(i);
        }
    }

    public void heapSort() {

        while (n >= 1) {
            int temp = data[n - 1];
            data[n - 1] = data[0];
            data[0] = temp;
            //  swap(0, n - 1);
            n--;
            sift(0);
        }
    }

    public void display() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ", ");
        }
    }
}
