import java.util.*;

public class pattern12 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        int i,j;
        int a=0;
        int b=1;
        int c;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(a+"\t");
                c=a+b;
                a=b;
                b=c;
            }
        System.out.println();
        }

    }
}