import java.util.*;

public class pattern4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        int i,j;
        int nst,nsp;
        nst=n;
        nsp=0;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=nsp;j++)
            {
                System.out.print("\t");
            }
            
            for(j=1;j<=nst;j++)
            {
                System.out.print("*\t");
            }
        System.out.println();
        nst--;
        nsp++;
        }

    }
}