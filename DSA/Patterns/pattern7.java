import java.util.*;

public class pattern7 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(i==j)
                {
                    System.out.print("*\t");
                }else
                {
                    System.out.print("\t");
                }
            }
        System.out.println();
        }

    }
}