import java.io.*;
import java.util.*;

public class SpiralDisplay {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int a[][]=new int[n][m];
        int i,j;
        for( i=0;i<a.length;i++)
        {
            for( j=0;j<a[0].length;j++)
            {
                a[i][j]=scn.nextInt();
            }
        }
        
        int minr=0;
        int minc=0;
        int maxr=a.length-1;
        int maxc=a[0].length-1;
        int tne=n*m;
        int c=0;
        while(c<tne)
        {
            //left wall
            for(i=minr,j=minc;i<=maxr && c<tne;i++)
            {
                System.out.println(a[i][j]);
                c++;
            }
            minc++;
            //bottom wall
            for(i=maxr,j=minc;j<=maxc && c<tne;j++)
            {
                System.out.println(a[i][j]);
                c++;
            }
            maxr--;
            //right wall
            for(i=maxr,j=maxc;i>=minr && c<tne;i--)
            {
                System.out.println(a[i][j]);
                c++;
            }
            maxc--;
            //top wall
            for(i=minr,j=maxc;j>=minc && c<tne;j--)
            {
                System.out.println(a[i][j]);
                c++;
            }
            minr++;
        }
    }

}