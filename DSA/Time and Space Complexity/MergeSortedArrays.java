import java.util.*;

public class MergeSortedArrays {

  public static void mergeWithNoSpace(int[] arr1, int[] arr2) {
    //Write your code here
    int s1 = arr1.length;
    int s2 = arr2.length;
    int []ans = new int[s1 + s2];
    int i = 0;
    int j = 0;
    int k = 0;
    while (i != s1 && j != s2)
    {
      if (arr1[i] < arr2[j])
      {
        ans[k] = arr1[i];
        i++;
        k++;
      } else
      {
        ans[k] = arr2[j];
        k++;
        j++;
      }
    }

    if (i == s1)
    {
      while (j != s2)
      {
        ans[k] = arr2[j];
        j++;
        k++;
      }
    }

    if (j == s2)
    {
      while (i != s1)
      {
        ans[k] = arr1[i];
        i++;
        k++;
      }
    }

    for (int d = 0; d < ans.length; d++)
    {
      System.out.print(ans[d] + " ");
    }

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] A = new int[sc.nextInt()];
    int[] B = new int[sc.nextInt()];
    for (int i = 0; i < A.length; i++) {
      A[i] = sc.nextInt();
    }
    for (int i = 0; i < B.length; i++) {
      B[i] = sc.nextInt();
    }
    mergeWithNoSpace(A, B);
  }

}