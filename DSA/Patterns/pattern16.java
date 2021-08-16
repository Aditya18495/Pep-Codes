import java.util.*;

public class pattern16{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     int n=scn.nextInt();
     int i,j;
     int nst=1;
     int nsp=(2*n)-3;
     for(i=1;i<=n;i++)
     {
         int val=1;
         for(j=1;j<=nst;j++)
         {
             System.out.print(val+"\t");
             val++;
         }
         
         for(j=1;j<=nsp;j++)
         {
             System.out.print("\t");
         }
         
         if(i==n)
         {
             nst--;
             val--;
         }
         val--;
         for(j=1;j<=nst;j++)
         {
             System.out.print(val+"\t");
             val--;
         }
    System.out.println();
    nst++;
    nsp-=2;

 }
}
}