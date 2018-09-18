package bubblesort;

public class BubbleSort {

    public static int aRandomNumber(int low, int hight) {
        return (int) (low + Math.random() * (hight - low));
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
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

    public static void main(String[] args) {
        int[] a = new int[10];// can increase the number
        for (int i = 0; i < a.length; i++) {
            a[i] = aRandomNumber(0, 100);
        }
        System.out.println("Bubble Sort");
        bubbleSort(a);
        printArray(a);
    }

}
