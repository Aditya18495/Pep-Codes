import java.util.*;

public class pattern17 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        int i,j;
        int nsp=n/2;
        int nst=1;
        for(i=1;i<=n;i++)
        {
            
             for(j=1;j<=nsp;j++)
                {
                    if(i== n/2+1)
                    {
                        System.out.print("*\t");
                    }else{
                    System.out.print("\t");
                }
                }
            
             for(j=1;j<=nst;j++)
            {
                System.out.print("*\t");
            }
        
        System.out.println();
        if(i<=n/2)
        {
            nst++;
        }else
        {
            nst--;
        }
        }

    }
}