package BasicRecursion;

public class FibonacciCalc {
    // Recursive function to calculate Fibonacci numbers
    public static int fibonacciRecursion(int n) {
        // Base case: If n is 0, return 0
        if (n == 0) {
            return 0;
        }
        // Base case: If n is 1 or 2, return 1
        if (n == 1 || n == 2) {
            return 1;
        }
        // Recursive case: Fibonacci(n) = Fibonacci(n-2) + Fibonacci(n-1)
        return fibonacciRecursion(n - 2) + fibonacciRecursion(n - 1);
    }

    // Main method to demonstrate the Fibonacci series
    public static void main(String args[]) {
        int maxNumber = 10;
        System.out.print("Fibonacci Series of " + maxNumber + " numbers: ");
        // Loop to print the Fibonacci series for the first 10 numbers
        for (int i = 0; i < maxNumber; i++) {
            System.out.print(fibonacciRecursion(i) + " ");
        }
    }
}
