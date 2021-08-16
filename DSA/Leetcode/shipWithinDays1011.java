import java.util.*;
import java.io.*;
public class shipWithinDays1011 {
    public static void main(String [] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int weights[]=new int[n];
        for(int i=0;i<weights.length;i++)
        {
            weights[i]=scn.nextInt();
        }
        int D=scn.nextInt();
        int sum=0;
        for(int i=0;i<weights.length;i++)
        {
            sum+=weights[i];
        }
        int max=weights[0];
        for(int i=0;i<weights.length;i++)
        {
            if(weights[i]>max)
            {
                max=weights[i];
            }
        }
        
        int lo=max;
        int hi=sum;
        int ans=hi;
        while(lo<=hi)
        {
            int mid=(lo+hi)/2;
            
            int cwt=0;
            int reqd=1;
            for(int i=0;i<weights.length;i++)
            {
                if(cwt+weights[i]>mid)
                {
                    reqd++;
                    cwt=0;
                }
                cwt=cwt+weights[i];
            }
            
            if(reqd>D)
            {
                lo=mid+1;
            }else
            {
                ans=mid;
                hi=mid-1;
            }
            
        }
        System.out.println(ans);
    }
}