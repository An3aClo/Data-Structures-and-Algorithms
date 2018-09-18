package quicksort;

public class QuickSort {

    public static int aRandomNumber(int low, int hight) {
        return (int) (low + Math.random() * (hight - low));
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
        int[] a = new int[10];// can increase the number
        for (int i = 0; i < a.length; i++) {
            a[i] = aRandomNumber(0, 100);
        }
        System.out.println("Quick Sort");
        quickSort(a);
        printArray(a);
    }

}
