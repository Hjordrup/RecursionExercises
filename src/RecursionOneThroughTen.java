public class RecursionOneThroughTen {


    public static void main(String[] args) {
        System.out.println(recursiveNum(10));
    }

    private static int recursiveNum(int n) {
        if(n ==  1) {
            return 1;
        }else {
            System.out.println(n);
            return recursiveNum(n -1);
        }

    }


}
