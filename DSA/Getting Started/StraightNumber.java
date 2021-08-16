import java.util.*;

public class StraightNumber {

    public static void main(String[] args) {
        // write your code here  
        Scanner sc = new Scanner(System.in);
        int n, nod = 0;
        n = sc.nextInt();
        int temp = n;
        int i;
        int pow = 1;
        int r, q;
        while (temp != 0) {
            temp = temp / 10;
            nod++;
        }
        for (i = 1; i < nod; i++) {
            pow = pow * 10;
        }
        while (pow != 0) {
            r = n % pow;
            q = n / pow;
            System.out.println(q);
            n = r;
            pow = pow / 10;

        }
    }
}