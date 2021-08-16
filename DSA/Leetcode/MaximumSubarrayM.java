import java.util.*;
import java.io.*;
public class MaximumSubarrayM {
    public static void main(String []args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=scn.nextInt();
        }
        int csum=0;
        int osum=Integer.MIN_VALUE;//it means -infinity
        for(int p=0;p<nums.length;p++)
        {
            if(csum<0)
            {
                csum=nums[p];
            }else{
                csum=csum+nums[p];
            }
                if(csum>osum)
                {
                    osum=csum;
                }
        }
        System.out.println(osum);
    }
}