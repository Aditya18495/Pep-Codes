import java.io.*;
import java.util.*;

public class Rotateby90 {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int i,j;
        int a[][]=new int[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=scn.nextInt();
            }
        }
        
        //transpose
        for(i=0;i<n;i++)
        {
            for(j=i;j<n;j++)
            {
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
        
        for(i=0;i<n;i++)
        {
            int li=0;
            int ri=n-1;
            while(li<ri)
            {
                int t=a[i][li];
                a[i][li]=a[i][ri];
                a[i][ri]=t;
                li++;
                ri--;
            }
        }
        
        display(a);
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}