import java.io.*;
import java.util.*;

public class getStairsPaths {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList < String > ans = getStairPaths(n);
        System.out.print(ans);

    }

    public static ArrayList < String > getStairPaths(int n) {
        if (n < 0) {
            ArrayList < String > tempres = new ArrayList < > ();
            //tempres.add("");
            return tempres;
        }

        if (n == 0) {
            ArrayList < String > tempres = new ArrayList < > ();
            tempres.add("");
            return tempres;
        }

        ArrayList < String > smallres1 = getStairPaths(n - 1);

        ArrayList < String > smallres2 = getStairPaths(n - 2);

        ArrayList < String > smallres3 = getStairPaths(n - 3);

        ArrayList < String > finalres = new ArrayList < > ();

        for (int i = 0; i < smallres1.size(); i++) {
            finalres.add(1 + smallres1.get(i));
        }

        for (int i = 0; i < smallres2.size(); i++) {
            finalres.add(2 + smallres2.get(i));
        }

        for (int i = 0; i < smallres3.size(); i++) {
            finalres.add(3 + smallres3.get(i));
        }

        return finalres;
    }

}