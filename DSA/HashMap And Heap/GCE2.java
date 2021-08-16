import java.io.*;
import java.util.*;

public class GCE2 {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int a1[] = new int[n1];

    for (int i = 0; i < n1; i++)
    {
      a1[i] = scn.nextInt();
    }

    int n2 = scn.nextInt();
    int a2[] = new int[n2];

    for (int i = 0; i < n2; i++)
    {
      a2[i] = scn.nextInt();
    }

    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < a1.length; i++)
    {
      int val = a1[i];

      if (map.containsKey(val))
      {
        int count = map.get(val);
        count++;
        map.put(val, count);
      } else
      {
        map.put(val, 1);
      }
    }

    System.out.println("The answer is:");
    for (int i = 0; i < n2; i++)
    {

      if (map.containsKey(a2[i]) && map.get(a2[i]) > 0)
      {
        System.out.println(a2[i]);
        int count = map.get(a2[i]);
        count--;
        map.put(a2[i], count);
      }
    }
  }

}