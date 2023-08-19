import java.util.Arrays;

public class Q02minmaxArray {

    static void usingSort(int[] array){
        Arrays.sort(array);
        int min = array[0];
        System.out.println("MIN Value of Array is : " + min);
        int max = array[array.length - 1];
        System.out.println("MAX value in Array is : " + max);
    }

//    Using linear search

    static class Pair{
        int min;//Attributes
        int max;//Attributes
    }

    static Pair getMinMax(int arr[],int n){

//      className objName = new clasName
//      creating Object Name : minmax
        Pair minmax = new Pair();
        int i;

//      If there is only one element then return it as min and max both
        if (n == 1){
            minmax.min = arr[0];//min is attributes of class minmax
            minmax.max = arr[0];//max is attributes of class minmax
            return minmax;
        }

//        if there are more than one element, then initialize min and max

        if (arr[0] > arr[1]){
            minmax.max = arr[0];
            minmax.min = arr[1];
        }else {
            minmax.max = arr[1];
            minmax.min = arr[0];
        }
        for (i = 2; i < n; i++){
            if (arr[i] > minmax.max){
                minmax.max = arr[i];
            } else if (arr[i] < minmax.min) {
                minmax.min = arr[i];
            }
        }
        return minmax;
    }
    public static void main(String[] args) {
        int[] array = {1,4,7,2,5,8,3,6,9};
//        usingSort(array);
    }
}
