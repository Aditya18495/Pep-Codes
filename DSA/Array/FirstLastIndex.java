import java.io.*;
import java.util.*;

public class FirstLastIndex {

    public static void main(String[] args) throws Exception {
        // write your code here
         Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []a=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=scn.nextInt();
        }
        int d=scn.nextInt();
        int low=0;
        int high=a.length-1;
        int first=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(a[mid]==d)
            {
                first=mid;
                high=mid-1;
            }else if(a[mid]<d){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        
         low=0;
         high=a.length-1;
        int last=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(a[mid]==d)
            {
                last=mid;
                low=mid+1;
            }else if(a[mid]<d){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
    System.out.println(first);
    System.out.println(last);
    }

}