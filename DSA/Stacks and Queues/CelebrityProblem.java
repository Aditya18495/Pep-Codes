import java.io.*;
import java.util.*;

public class CelebrityProblem {

  public static void main(String[] args) throws Exception {
    // write your code here
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[][] arr = new int[n][n];

    for (int j = 0; j < n; j++) {
      String line = br.readLine();
      for (int k = 0; k < n; k++) {
        arr[j][k] = line.charAt(k) - '0';
      }
    }

    findCelebrity(arr);

  }

  public static void findCelebrity(int[][] arr) {
    // if a celebrity is there print it's index (not position), if there is not then
    // print "none"
    
    Stack<Integer> st=new Stack<>();
    for(int i=0;i<arr.length;i++)
    {
        st.push(i);
    }
    
    while(st.size()>1)
    {
        int last=st.pop();
        int slast=st.pop();
        int val=arr[last][slast];
        if(val==0)
        {
            st.push(last);
        }else if(val==1)
        {
            st.push(slast);
        }
    }
    
    int pceb=st.pop();
    for(int i=0;i<arr.length;i++)
    {
        if(i!=pceb)
        {
            if(arr[pceb][i]==1 || arr[i][pceb]==0)
            {
                System.out.println("none");
                return;
            }
        }
    }
    System.out.println(pceb);
  }

}