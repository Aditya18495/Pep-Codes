import java.io.*;
import java.util.*;

public class StoryofWakanda1{

public static void main(String[] args) throws Exception {
    // write your code here
    //Wave Traversal
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int m=scn.nextInt();
    int i,j;
    int a[][]=new int[n][m];
    for(i=0;i<n;i++)
    {
        for(j=0;j<m;j++)
        {
            a[i][j]=scn.nextInt();
        }
    }
    for(j=0;j<a[0].length;j++)
    {
        if(j%2==0)
        {   
            for(i=0;i<a.length;i++)
            System.out.println(a[i][j]);
        }else
        {
            for(i=a.length-1;i>=0;i--)
            System.out.println(a[i][j]);
        }
    }
 }

}