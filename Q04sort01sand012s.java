public class Q04sort01sand012s {

    static void printArray(int[] array){
        int n = array.length;
        for (int val : array) {
            System.out.print(val + " ");
        }
        System.out.println(" ");
    }


    static void sort01s(int[] array){
        int n =array.length;
        int z = 0;int o = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] == 0) z++;
            if (array[i] == 1) o++;
        }
        int k = 0;
        while (k < z) array[k++] = 0;
        o = o + z;
        while (k < o) array[k++] = 1 ;
        printArray(array);
    }

    static void sort012s(int[] array){
        int n =array.length;
        int z = 0;int o = 0;int t = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] == 0) z++;
            if (array[i] == 1) o++;
            if (array[i] == 2) t++;
        }
        int k = 0;
        while (k < z) array[k++] = 0;
        o = o + z;
        while (k < o) array[k++] = 1 ;
        t = t + o;
        while (k < t) array[k++] = 2;
        printArray(array);
    }

    public static void main(String[] args) {
        int[] array01s = {0,1,1,0,0,1,0,1,0,1,0};
        sort01s(array01s);
        int[] array012s = {0,1,2,1,2,0,2,0,2,1,2,0,1,2,0,2,1,0};
        sort012s(array012s);
    }
}
