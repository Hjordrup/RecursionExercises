public class RecursiveSelectionSort {


    public static void main(String[] args) {

    double[] list = {10, 5, 8, 9, 4, 6};
    sort(list);




    }
    public static void sort(double[] list){ sort(list, 0 , list.length -1);}


    public static void sort(double[] list,int low, int high ){
     if(low < high){
      int indexOfMin = low;
      double min = list[low];
         for (int i = 0; i < low +1 ; i++) {
             if(list[i] < min){
                 min = list[i];
                 indexOfMin = i;
             }
         }
         list[indexOfMin] = list[low];
         list[low] = min;

         sort(list, low +1, high);
     }
    }
}
