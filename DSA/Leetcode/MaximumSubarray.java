import java.util.*;
import java.io.*;
public class MaximumSubarray {
    public static void main(String []args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=scn.nextInt();
        }
        int csum;
        int osum=Integer.MIN_VALUE;//it means -infinity
        for(int sp=0;sp<nums.length;sp++)
        {
            csum=0;
            for(int ep=sp;ep<nums.length;ep++)
            {
                csum=csum+nums[ep];
                if(csum>osum)
                {
                    osum=csum;
                }
            }
        }
        System.out.println(osum);
    }
}