import java.io.*;
import java.util.*;

public class maxOfArray {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }
        int max = maxOfArray(a, 0);
        System.out.println(max);
    }

    public static int maxOfArray(int[] arr, int idx) {
        if (idx > arr.length - 1) {
            return 0;
        }
        int misa=maxOfArray(arr,idx+1);
        if(misa>arr[idx])
        {
            return misa;
        }else{
            return arr[idx];
        }
    }

}