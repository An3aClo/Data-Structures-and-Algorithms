package recursivebinarysearch;

import java.util.Arrays;

public class RecursiveBinarySearch {

    public static int aRandomNumber(int low, int hight) {
        return (int) (low + Math.random() * (hight - low));
    }

    public static void print(int[] y) {
        for (int j = 0; j < y.length; j++) {
            System.out.println(y[j]);
        }
    }

    public static boolean binarySearchFor(int[] z, int value) {
        int left = 0;
        int right = z.length;

        while (left <= right) {

            int middel = (left + right);
            if (z[middel] == value) {
                return true;
            } else if (value < z[middel]) {
                right = middel - 1;
            } else if (z[middel] < value) {
                left = middel + 1;
            }
        }
        while (left <= right) {
            int middel = (left + right) / 2;
            if (z[middel] == value) {
                return true;
            } else if (value < z[middel]) {
                right = middel - 1;
            } else if (z[middel] < value) {
                left = middel + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = new int[100];// can increase the number
        for (int i = 0; i < a.length; i++) {
            a[i] = aRandomNumber(0, 100);
        }

        Arrays.sort(a);// sort the arry that must be done in order to use binary search

        if (binarySearchFor(a, 9) == (true)) {//Recurcive Binary Search
            System.out.println("Found it! ");
        } else {
            System.out.println("Not Found");
        }

        print(a);
    }

}
