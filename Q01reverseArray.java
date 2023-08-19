public class Q01reverseArray {

    static void swap(int[] array,int i ,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    static void printArray(int[] array){
        int n = array.length;
            for (int val : array) {
                System.out.print(val + " ");
            }
        System.out.println(" ");
    }

    static void iterativeWay(int[] array){
        int i = 0; int j = array.length - 1;

        while (i < j){
            swap(array,i,j);
            i++;j--;
        }
        printArray(array);
    }

    static void recursiveWay(int[] array,int st, int end){

        int temp;
        if (st >= end) return;
        temp = array[st];
        array[st] = array[end];
        array[end] = temp;
        recursiveWay(array,st+1,end-1);
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int[] array1 = {1,2,3,4,5,6,7,8,9};
        iterativeWay(array1);
        printArray(array1);
        recursiveWay(array,0,array.length - 1);
        printArray(array);
    }
}
