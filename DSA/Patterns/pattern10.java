import java.util.*;

public class pattern10{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     int n=scn.nextInt();
     int i,j;
     int osp,isp;
     osp=n/2;
     isp=-1;
     for(i=1;i<=n;i++)
     {
         for(j=1;j<=osp;j++)
         {
             System.out.print("\t");
         }
         
             System.out.print("*\t");
         
         for(j=1;j<=isp;j++)
         {
             System.out.print("\t");
         }
         
         if((i>1)&&(i<n))
         {
         System.out.print("*\t");
         }
         
     System.out.println();
     if(i<=n/2)
     {
         osp--;
         isp+=2;
        ;
     }else
     {
         osp++;
         isp-=2;
     }
    }

 }
}