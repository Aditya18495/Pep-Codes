import java.io.*;
import java.util.*;

public class StockSpanUsingStack{
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
   
  // Next greater element on left
   for(int i=arr.length-1;i>=0;i--)
   {
        while(st.size()>0 && arr[i]>arr[st.peek()])
       {
           int solvedidx=st.pop();
           ans[solvedidx]=solvedidx-i;
       }
       
       st.push(i);
   }
   
   while(st.size()>0)
   {
       int idx=st.pop();
       ans[idx]=idx+1;
   }
   return ans;
 }

}