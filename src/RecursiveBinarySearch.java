public class RecursiveBinarySearch {


    public static void main(String[] args) {

        int[] list = {1,2,3,4,5,6,7,8,9,100};
        int index = recursiveBinarySearch(list, 12);

        System.out.println( index == -1 ? "The element is not in the list ": "The element is placed in the "
        + index +" index ");


    }

    public static int recursiveBinarySearch(int[] list, int key){
        int low = 0;
        int high = list.length-1;
        return recursiveBinarySearch(list, key, low, high);
    }

    public static int recursiveBinarySearch(int[] list, int key, int low, int high){
        if(low>high){
            return -1;
        }
        int mid = (low+high)/2;
        if(key == list[mid] ){
            return mid;
        }
        if(key<list[mid]){
            return recursiveBinarySearch(list, key, low, mid -1 );
        }else return recursiveBinarySearch(list, key, mid +1, high);
    }



}
