public class FibonacciRecursion {


    public static void main(String[] args) {


        int amountOfNumToPrint = 20;
        for (int i = 0; i < amountOfNumToPrint; i++) {
            System.out.print(fibonacci(i) + " ");
        }


    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);
    }


}
