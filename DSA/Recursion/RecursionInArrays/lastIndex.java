import java.io.*;
import java.util.*;

public class lastIndex {

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
        int last=lastIndex(a,0,x);
        System.out.println(last);
    }

    public static int lastIndex(int[] arr, int idx, int x) {
        if(idx>arr.length-1)
        {
            return -1;
        }
        
        int tempans=lastIndex(arr,idx+1,x);
        if(tempans!=-1)
        {
            return tempans;
        }
        
         if(arr[idx]==x)
        {
            return idx;
        }
        
        return -1;
       
    }

}