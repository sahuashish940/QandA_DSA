public class Q05allNegativeRightSideOfArray {

    static void printArray(int[] array){
        int n = array.length;
        for (int val : array) {
            System.out.print(val + " ");
        }
        System.out.println(" ");
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

//    two pointer approach

    static void NRightSide(int[] array){
        int n = array.length;
        int j = 0,temp;
        for (int i = 0; i < n; i++) {
            if (array[i] < 0){
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                j++;
            }
        }
        printArray(array);
    }

    // function to sift all negative integers to the left and all positive integers to the right using Dutch National Flag Algorithm
    public static void move(int[] ar)
    {
        int low = 0;
        int high = ar.length - 1;
        while (low <= high) {
            if (ar[low] <= 0)
                low++;
            else
                swap(ar, low, high--);
        }
        printArray(ar);
    }

    public static void main(String[] args) {
        int[] array = {-9,6,-3,8,-5,0,2,-4,0,7,-1};
        int[] array1 = {5,4,2,-1,3,-4};
//        NRightSide(array1);
        move(array1);
    }
}
