import java.util.*;
public class pattern13{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        //PASCAL'S TRIANGLE
        //write your code here
        int n=scn.nextInt();
        int i,j;
         for(i=0;i<n;i++)
        {
            int val=1;
            for(j=0;j<=i;j++)
            {
                System.out.print(val+"\t");
                int b=i-j;
                int c=j+1;
                val=(val*b)/c;
            }
            System.out.println();
        }

    }
}