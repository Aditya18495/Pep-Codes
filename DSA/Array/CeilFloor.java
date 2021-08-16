import java.io.*;
import java.util.*;

public class CeilFloor {

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
        int floor=-1;
        int ceil=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(a[mid]==d)
            {
                floor=a[mid];
                ceil=a[mid];
                break;
            }else if(a[mid]<d){
                low=mid+1;
                floor=a[mid];
            }else{
                high=mid-1;
                ceil=a[mid];
            }
        }
        System.out.println(ceil);
        System.out.println(floor);
    }

}