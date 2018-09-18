package binarysearch;

import java.util.*;

public class BinarySearch {

    public static int aRandomNumber(int low, int hight) {
        return (int) (low + Math.random() * (hight - low));
    }

    public static void print(int[] y) {
        for (int j = 0; j < y.length; j++) {
            System.out.println(y[j]);
        }
    }


    public static boolean binarySearch(int[] x, int target) {
        return binarySearch(x, target, 0, x.length - 1);
    }

    public static boolean binarySearch(int[] z, int value, int left, int right) {
        if (left > right) {
            return false;
        }
        int middel = (left + right) / 2;
        if (z[middel] == value) {// base case
            return true;
        } else if (value < z[middel]) {//recursive case 1
            return binarySearch(z, value, left, middel - 1);
        } else if (z[middel] < value) {// recursive case 2
            return binarySearch(z, value, middel + 1, right);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = new int[100];// can increase the number
        for (int i = 0; i < a.length; i++) {
            a[i] = aRandomNumber(0, 100);
        }

        Arrays.sort(a);// sort the arry that must be done in order to use binary search

        if (binarySearch(a, 10) == (true)) { //Binary Search
            System.out.println("Found it! ");
        } else {
            System.out.println("Not Found");
        }
        print(a);

    }

}
