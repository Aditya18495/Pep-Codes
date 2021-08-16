import java.util.*;

public class pattern6 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        int i,j;
        int nsp,nst;
        nst=n/2+1;
        nsp=1;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=nst;j++)
            {
                System.out.print("*\t");
            }
            
            for(j=1;j<=nsp;j++)
            {
                System.out.print("\t");
            }
            
             for(j=1;j<=nst;j++)
            {
                System.out.print("*\t");
            }
        System.out.println();
        if(i<=n/2)
        {
            nst--;
            nsp+=2;
        }else
        {
            nst++;
            nsp-=2;
        }
        }

    }
}