import java.util.*;

public class pattern19{

public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int i,j;
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=n;j++)
        {
            if(i==1)
            {
                if(j<=n/2 +1 || j==n)
                {
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
        else
            if(i>1 && i<n/2 +1)
            {
                if(j==n/2 +1 || j==n)
                {
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
        else    
            if(i==n/2 +1)
            {
                System.out.print("*\t");
            }
        else    
            if(i>n/2+1 && i<n)
            {
                if(j==n/2 +1 || j==1)
                {
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
        else    
            if(i==n)
            {
                if(j>=n/2 +1 || j==1)
                {
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
        }
    System.out.println();
    }
 }
}