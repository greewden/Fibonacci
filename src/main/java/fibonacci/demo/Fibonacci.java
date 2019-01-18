package fibonacci.demo;

public class Fibonacci {

    public static long calculate(long n) {
       long result = 0;
       long nMinus1 = 1;
       long nMinus2 = 0;

       if (n == 0 || n == 1) {
           return n;
       }

        for (int i = 2; i <= n; i++) {
           result = nMinus1 + nMinus2;
           nMinus2 = nMinus1;
           nMinus1 = result;
        }
        return result;
    }
}
