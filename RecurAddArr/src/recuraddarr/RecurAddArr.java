package recuraddarr;

public class RecurAddArr {

    public static int add(int[] y, int start, int end) {
        if (start != end) {
            return y[start] + add(y, start + 1, end);
        } else {
            return y[end];
        }
    }

    public static int add(int[] x) {
        return add(x, 0, x.length - 1);
    }

    public static void main(String[] args) {

        int [] a={1,2,3,4,5,6,7,8,9,10};
        System.out.println("Sum = "+ add(a));
    }

}
