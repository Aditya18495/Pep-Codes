import java.util.*;

public class pattern18{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     int n=scn.nextInt();
     int i,j;
     int nst=n;
     int osp=0;
     int isp=0;
     for(i=1;i<=n;i++)
     {
         for(j=1;j<=osp;j++)
         {
             System.out.print("\t");
         }
         
         for(j=1;j<=nst;j++)
         {
             if(i> 1 && i<= n/2 && j>1 && j<nst)
             {
                 System.out.print("\t");
             }else
             {
                System.out.print("*\t");
             }
         }
         
         for(j=1;j<=isp;j++)
         {
             System.out.print("\t");
         }
         
        System.out.println();
        if(i<=n/2)
        {
            osp++;
            nst-=2;
        }else
        {
            osp--;
            nst+=2;
        }
     }

 }
}