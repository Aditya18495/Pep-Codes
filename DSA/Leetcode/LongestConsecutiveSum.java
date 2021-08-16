import java.util.*;
import java.io.*;

public class LongestConsecutiveSum {
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=scn.nextInt();
        }
        int ans=longestConsecutive(nums);
        System.out.println(ans);
    }

    public static int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i];
            
            if(map.containsKey(n)==false)
            {
                int sp=n;
                int ep=n;
                
                if(map.containsKey(n-1)==true)
                {
                    sp=sp-map.get(n-1);
                }
                
                if(map.containsKey(n+1)==true)
                {
                    ep=ep+map.get(n+1);
                }
                
                int newlen=ep-sp+1;
                
                map.put(sp,newlen);
                map.put(ep,newlen);
                if(sp!=n && ep!=n)
                {
                    map.put(n,1);
                }
                
                max=Math.max(max,newlen);
            }
        }
        return max;
    }
}