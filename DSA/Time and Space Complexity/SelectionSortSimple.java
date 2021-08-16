import java.util.Scanner;

public class SelectionSortSimple {

  public static void selectionSort(int arr[]) {
    //Write your code here.
    for (int itr = 0; itr < arr.length - 1; itr++)
    {
      int minidx = itr;
      for (int idx = itr + 1; idx < arr.length; idx++)
      {
        if (arr[minidx] > arr[idx])
        {
          minidx=idx;
        }
      }
        int temp=arr[minidx];
        arr[minidx]=arr[itr];
        arr[itr]=temp;
    }

  }



  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = s.nextInt();
    }
    selectionSort(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}