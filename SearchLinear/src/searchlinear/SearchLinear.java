package searchlinear;

import java.util.*;

public class SearchLinear {

    public static int aRandomNumber(int low, int hight) {
        return (int) (low + Math.random() * (hight - low));
    }

    public static boolean searchFor(int[] x, int value) {// slinear search method
        for (int i = 0; i < x.length; i++) {
            if (x[i] == value) {
                return true;
            }
        }
        return false;
    }

    public static void print(int[] y) {
        for (int j = 0; j < y.length; j++) {
            System.out.println(y[j]);
        }
    }

    public static void main(String[] args) {
        int[] a = new int[100];// can increase the number
        for (int i = 0; i < a.length; i++) {
            a[i] = aRandomNumber(0, 100);
        }
        if (searchFor(a, 9) == (true)) { // Linear Search
            System.out.println("Found it! ");
        } else {
            System.out.println("Not Found");
        }
        Arrays.toString(a); //What does this do
       print(a);
    }

}
