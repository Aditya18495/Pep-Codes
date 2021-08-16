import java.io.*;
import java.util.*;

public class FindElementinArray{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int a[]=new int[n];
    int i;
    for(i=0;i<n;i++)
    {
        a[i]=scn.nextInt();
    }
    
    int d=scn.nextInt();
    int idx=-1;
    for(i=0;i<n;i++)
    {
        if(a[i]==d)
        {
        idx=i;
        break;
        }
    }
    System.out.println(idx);
 }

}