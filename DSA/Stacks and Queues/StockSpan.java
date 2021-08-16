import java.io.*;
import java.util.*;

public class StockSpan{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] span = solve(a);
    display(span);
 }

 public static int[] solve(int[] arr){
   int ans[]=new int[arr.length];
   Stack<Integer> st=new Stack<>();
   
   ans[0]=1;
   for(int i=1;i<arr.length;i++)
   {
       int c=0;
       for(int j=i-1;j>=0;j--)
       {
           if(arr[i]>arr[j])
           {
               c++;
           }else
           {
                break;   
           }
       }
    c++;
    ans[i]=c;
   }
   return ans;
 }

}