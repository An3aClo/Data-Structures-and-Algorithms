package selectionsort;

public class SelectionSort {

    public static int aRandomNumber(int low, int hight) {
        return (int) (low + Math.random() * (hight - low));
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
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

    public static void main(String[] args) {
        int[] a = new int[10];// can increase the number
        for (int i = 0; i < a.length; i++) {
            a[i] = aRandomNumber(0, 100);
        }
        System.out.println("Selection Sort");
        selectSort(a);
        printArray(a);
    }

}
 