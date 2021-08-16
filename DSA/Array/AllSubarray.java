import java.io.*;
import java.util.*;

public class AllSubarray{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int i,j,k;
    int a[]=new int[n];
    for(i=0;i<a.length;i++)
    {
        a[i]=scn.nextInt();
    }
    
    for(i=0;i<a.length;i++)
    {
        for(j=i;j<a.length;j++)
        {
            for(k=i;k<=j;k++)
            {
                System.out.print(a[k]+"\t");
            }
        System.out.println();
        }
    }
 }

}