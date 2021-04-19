public class GCD {

    public static void main(String[] args) {

        System.out.println(greatestCommonDivisor(26, 17));


    }

    private static int greatestCommonDivisor(int i, int n) {

        if (i == 0) return n;
        if (n == 0) return i;
        if (i == n) return i;


        if (i > n)
            return greatestCommonDivisor(i-n, n);
        return greatestCommonDivisor(i, n-i);


    }
}