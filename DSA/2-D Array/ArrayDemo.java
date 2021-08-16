import java.io.*;
import java.util.*;

public class ArrayDemo{

public static void main(String[] args) throws Exception {
    // write your code here
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
    
     for(i=0;i<n;i++)
    {
        for(j=0;j<m;j++)
        {
            System.out.print(a[i][j]+" ");
        }
    System.out.println();
    }
 }

}