import java.io.*;
import java.util.*;

public class SubsetsofArray{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int i,j;
    int a[]=new int[n];
    for(i=0;i<a.length;i++)
    {
        a[i]=scn.nextInt();
    }
    
    int limit=(int)Math.pow(2,a.length);
    
    for(i=0;i<limit;i++)
    {
      int temp=i;
      String set="";
        for(j=a.length-1;j>=0;j--)
        {
            int r=temp%2;
            temp=temp/2;
        
            if(r==0)
            {
                set= "-\t" + set;    
            }else
            {
                set= a[j] + "\t" +set;
            }
        }
    System.out.println(set);
    }
 }

}