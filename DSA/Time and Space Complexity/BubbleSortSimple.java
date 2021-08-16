import java.util.Scanner;

public class BubbleSortSimple {

  public static void bubble(int arr[], int n) {
    //Write your code here.
    for (int itr = 1; itr <= n - 1; itr++)
    {
      for (int idx = 0; idx <= n - 1 - itr; idx++)
      {
        if (arr[idx] > arr[idx + 1])
        {
          int temp = arr[idx];
          arr[idx] = arr[idx + 1];
          arr[idx + 1] = temp;
        }
      }
    }
  }
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int[] ar = new int[n];
    for (int i = 0; i < ar.length; i++) {
      ar[i] = s.nextInt();
    }

    bubble(ar, n);
    for (int val : ar)
      System.out.print(val + " ");
  }

}