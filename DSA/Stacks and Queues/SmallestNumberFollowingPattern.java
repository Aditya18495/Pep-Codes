import java.io.*;
import java.util.*;

public class SmallestNumberFollowingPattern{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    // code
    int count=1;
    Stack<Integer> st=new Stack<>();
    for(int i=0;i<str.length();i++)
    {
        char ch=str.charAt(i);
        if(ch=='i')
        {
            st.push(count);
            count++;
            while(st.size()>0)
            {
                int rem=st.pop();
                System.out.print(rem);
            }
        }else
        {
            st.push(count);
            count++;
        }
    }
    
            st.push(count);
            count++;
            while(st.size()>0)
            {
                int rem=st.pop();
                System.out.print(rem);
            }
 }
}