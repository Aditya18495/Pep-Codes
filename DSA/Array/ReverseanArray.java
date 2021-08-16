import java.util.*;
import java.io.*;
public class ReverseanArray{
    public static void main(String []args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
        {
                a[i]=scn.nextInt();
        }
        
        int s=0;
        int l=a.length-1;
        while(s<=l)
        {
            int temp=a[s];
            a[s]=a[l];
            a[l]=temp;
            s++;
            l--;
        }
        
        for(int i=0;i<a.length;i++)
        {
                System.out.print(a[i]+" ");
        }
    }
}