
package recursivefactorial;


public class RecursiveFactorial {

    public static long factorial(long n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));        
// TODO code application logic here
    }

}
// use while loop uses less memory where as a recursive for/if loop uses more memmory