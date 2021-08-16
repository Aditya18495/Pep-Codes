import java.io.*;
import java.util.*;

public class firstIndex {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=scn.nextInt();
        }
        int x=scn.nextInt();
        int first=firstIndex(a,0,x);
        System.out.println(first);
    }

    public static int firstIndex(int[] arr, int idx, int x) {
        if(idx>arr.length-1)
        {
            return -1;
        }
        
        if(arr[idx]==x)
        {
            return idx;
        }
        
        int tempans=firstIndex(arr,idx+1,x);
        return tempans;
    }

}