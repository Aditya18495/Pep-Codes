import java.util.*;

public class GcdLcm {

    public static void main(String[] args) {
        // write your code here  
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int rem, dvd, div, l;
        dvd = num1;
        div = num2;
        rem = dvd % div;
        while (rem != 0) {
            dvd = div;
            div = rem;
            rem = dvd % div;
        }
        System.out.println(div);
        l = (num1 * num2) / div;
        System.out.println(l);
        //
    }
}