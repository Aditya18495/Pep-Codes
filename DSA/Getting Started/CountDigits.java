import java.util.*;

public class CountDigits {

    public static void main(String[] args) {
        // write your code here  
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int c = 0;
        while (n != 0) {
            n = n / 10;
            c++;
        }
        System.out.println(c);
    }
}