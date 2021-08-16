import java.io.*;
import java.util.*;

public class MatrixMultiplication{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int n1=scn.nextInt();
    int m1=scn.nextInt();
    int i,j;
    int a[][]=new int[n1][m1];
    for(i=0;i<n1;i++)
    {
        for(j=0;j<m1;j++)
        {
            a[i][j]=scn.nextInt();
        }
    }
    
    int n2=scn.nextInt();
    int m2=scn.nextInt();
    int b[][]=new int[n2][m2];
    for(i=0;i<n2;i++)
    {
        for(j=0;j<m2;j++)
        {
            b[i][j]=scn.nextInt();
        }
    }
    
    if(m1!=n2)
    {
        System.out.println("Invalid input");
        return;
    }
    
    int c[][]=new int[n1][m2];
    if(m1==n2)
    {
        for(i=0;i<n1;i++)
        {
            for(j=0;j<m2;j++)
            {
                for(int k=0;k<m1;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
    }
    
     for(i=0;i<n1;i++)
    {
        for(j=0;j<m2;j++)
        {
           System.out.print(c[i][j]+" ");
        }
    System.out.println();
    }
 }

}