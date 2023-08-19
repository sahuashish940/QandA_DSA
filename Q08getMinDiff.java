import java.util.Arrays;

public class Q08getMinDiff {

    static int minDiff(int[] arr,int k){
        int n = arr.length;
        Arrays.sort(arr);
        int ans = arr[n - 1] - arr[0];

        int tempMin;
        int tempMax;

        for (int i = 1; i < n; i++) {
            if (arr[i] - k < 0) continue;

            tempMin = Math.min( arr[0] + k, arr[i] - k);
            tempMax = Math.max(arr[n - 1] - k, arr[i - 1] + k);
            ans = Math.min(ans,tempMax - tempMin);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 15, 10};
        int[] arr2 = {1, 5, 15, 10};
        System.out.println("Minimum difference between two tower is : " + minDiff(arr,6));
        System.out.println("Minimum difference between two tower is : " + minDiff(arr2,3));
    }
}
