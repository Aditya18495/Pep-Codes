import java.util.*;

public class pattern15 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        int i,j;
        int nsp,nst;
        nsp=n/2;
        nst=1;
        int firstval=1;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=nsp;j++)
            {
                System.out.print("\t");
            }
            
            int presentval=firstval;
            for(j=1;j<=nst;j++)
            {
                System.out.print(presentval+"\t");
                
                if(j<=nst/2)
                {
                    presentval++;
                }else{
                    presentval--;
                }
               
            }
        System.out.println();
         if(i<=n/2)
                {
                    firstval++;
                    nst+=2;
                    nsp--;
                }else{
                    firstval--;
                    nst-=2;
                    nsp++;
                }

    }
}
}