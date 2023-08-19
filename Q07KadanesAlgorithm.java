public class Q07KadanesAlgorithm {
//    Given an array Arr[] of N integers. Find the
//    contiguous sub-array(containing at least one number)
//    which has the maximum sum and return its sum.

    static long kadaneAlgo(int[] arr){
        int n = arr.length;
        long sum = 0;
        long maxiz = arr[0];
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            maxiz = Math.max(sum,maxiz);
            if (sum < 0) sum = 0;
        }
        return maxiz;
    }
    public static void main(String[] args) {
       int[] arr1 = {1,2,3,-2,5};
        System.out.println("Maximum sum of subArray is : " + kadaneAlgo(arr1));
       int[] arr2 = {-1,-2,-3,-4};
        System.out.println("Maximum sum of subArray is : " + kadaneAlgo(arr2));
    }
}
