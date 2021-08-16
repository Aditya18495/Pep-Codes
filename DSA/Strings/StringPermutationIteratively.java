import java.io.*;
import java.util.*;

public class StringPermutationIteratively {

    public static void solution(String str) {
        // write your code here
        int fact=1;
        for(int i=2;i<=str.length();i++)
        {
            fact=fact*i;
        }
        
        for(int i=0;i<fact;i++)
        {
            int divid=i;
            StringBuilder temp=new StringBuilder(str);
            
            for(int divisor=str.length();divisor>=1;divisor--)
            {
                int rem=divid%divisor;
                int quo=divid/divisor;
                System.out.print(temp.charAt(rem));
                temp.deleteCharAt(rem);
                divid=quo;
            }
        System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }

}