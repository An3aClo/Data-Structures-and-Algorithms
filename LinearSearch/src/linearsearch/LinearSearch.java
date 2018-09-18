package linearsearch;

import java.util.Arrays;

public class LinearSearch {

    public static int aRandomNumber(int low, int hight) {
        return (int) (low + Math.random() * (hight - low));
    }

    public static boolean searchFor(int[] x, int value) {
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

    public static void bubbleSort(int[] n) {
        int count = n.length;
        int temp = 0;

        for (int a = 0; a < count; a++) {
            for (int b = 1; b < (count - a); b++) {
                if (n[b - 1] > n[b]) {
                    temp = n[b - 1];
                    n[b - 1] = n[b];
                    n[b] = temp;
                }
            }
        }
        /*Werki maar di hoe die lektor dit gedoen het  
        boolean swapped = false;
        for (int j = 0; j < a.length - 1; j++) {
            for (int i = 0; i < a.length - 1 - j; i++) {//-j make it stop making it shorter
                if (a[i + 1] > a[1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }*/
    }

    public static void selectSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int smallest = a[i];
            int pos = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < smallest) {
                    smallest = a[j];
                    pos = j;
                }
            }
            int temp = a[i];
            a[i] = a[pos];
            a[pos] = temp;
        }
    }

    public static void insertSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j = i - 1;
            while (j >= 0 && temp < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void quickSort(int[] a) {
        quickSort(a, 0, a.length - 1);

    }

    public static void quickSort(int[] a, int left, int right) {
        int index = partition(a, left, right);
        if (left < index - 1) {
            quickSort(a, left, index - 1);
        }
        if (index + 1 < right) {
            quickSort(a, index + 1, right);
        }
    }

    public static int partition(int[] a, int left, int right) {
        int pivotValue = a[(left + right) / 2];
        int low = left;
        int high = right;

        while (low <= high) {
            while (a[low] < pivotValue) {
                low++;
            }
            while (a[high] > pivotValue) {
                high--;
            }
            if (low <= high) {
                int temp = a[low];
                a[low] = a[high];
                a[high] = temp;

                low++;
                high--;
            }

        }
        return low;
    }

    public static void main(String[] args) {
        // TODO code application logic here

        int[] a = new int[100];// can increase the number
        for (int i = 0; i < a.length; i++) {
            a[i] = aRandomNumber(0, 100);
        }

      /* if (searchFor(a, 9) == (true)) { // Linear Search
            System.out.println("Found it! ");
        } else {
            System.out.println("Not Found");
        }
        Arrays.toString(a);
        print(a);
        Arrays.sort(a);
        
        if (binarySearch(a, 9) == (true)) { //Binary Search
            System.out.println("Found it! ");
        } else {
            System.out.println("Not Found");
        }

       if (binarySearchFor(a,9) == (true)) {//Recurcive Binary Search
            System.out.println("Found it! ");
        } else {
            System.out.println("Not Found");
        }
        
        print(a);*/
       // bubbleSort(a);//doesnt work  
        // selectSort(a);
        //insertSort(a);
        quickSort(a);
       printArray(a);

    }
}
