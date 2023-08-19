import java.util.Arrays;
public class Q06rotateArray {

    // Write a program to cyclically rotate an array by one.
    // Java code for program
    // to cyclically rotate
    // an array by one


        // Method for rotation
        static void rotate(int[] arr)
        {
            int last_el = arr[arr.length-1];
            for (int i = arr.length-1; i > 0; i--)
                arr[i] = arr[i-1];
            arr[0] = last_el;
        }

        /* Driver program */
        public static void main(String[] args) {
            int[] arr = {1,2,3,4,5,6,7,8,9};
            System.out.println("Given Array is");
            System.out.println(Arrays.toString(arr));

            // Function Call
            rotate(arr);

            System.out.println("Rotated Array is");
            System.out.println(Arrays.toString(arr));
        }
}
