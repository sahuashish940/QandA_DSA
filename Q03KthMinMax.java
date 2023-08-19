import java.util.Arrays;

public class Q03KthMinMax {
    static void usingSort(int[] array,int k){
        Arrays.sort(array);
        int min = array[k - 1];
        System.out.println("Kth MIN Value of Array is : " + min);
        int max = array[array.length - 3];
        System.out.println("Kth MAX value in Array is : " + max);
    }

    public static void main(String[] args) {
        int[] array = {1,4,7,2,5,8,3,6,9};
        usingSort(array,3);
    }

}
