import java.io.*;
import java.util.*;

public class SumofArray{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int i,j,k;
    int n1=scn.nextInt();
    int a[]=new int[n1];
    for(i=0;i<n1;i++)
    {
        a[i]=scn.nextInt();
    }
    
    int n2=scn.nextInt();
    int b[]=new int[n2];
     for(j=0;j<n2;j++)
    {
        b[j]=scn.nextInt();
    }
    
    
    
    int len=Math.max(n1,n2)+1;
    int ans[]=new int[len];
    
    
    
   
    
    i=n1-1;
    j=n2-1;
    k=len-1;
    int carry=0;
    
    while(k>=0)
    {
        int sum=0;
        if(i>=0)
        {
            sum=sum+a[i];
        }
        
        if(j>=0)
        {
            sum=sum+b[j];
        }
        
        sum=sum+carry;
        int quo=sum/10;
        int rem=sum%10;
        
        carry=quo;
        ans[k]=rem;
        
        i--;
        j--;
        k--;
    }
    
    if(ans[0]!=0)
    {
        System.out.println(ans[0]);
    }
    
    for(int l=1;l<ans.length;l++)
    System.out.println(ans[l]);
    
 }

}