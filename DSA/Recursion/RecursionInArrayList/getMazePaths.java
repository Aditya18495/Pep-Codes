import java.io.*;
import java.util.*;

public class getMazePaths {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        ArrayList < String > ans = getMazePaths(0, 0, r - 1, c - 1);
        System.out.println(ans);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList < String > getMazePaths(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList < String > tempans = new ArrayList < > ();
            tempans.add("");
            return tempans;
        }

        if (sr > dr || sc > dc) {
            ArrayList < String > tempans = new ArrayList < > ();
            //tempans.add("");
            return tempans;
        }

        ArrayList < String > smallres1 = getMazePaths(sr, sc + 1, dr, dc);

        ArrayList < String > smallres2 = getMazePaths(sr + 1, sc, dr, dc);

        ArrayList < String > finalres = new ArrayList < > ();

        for (int i = 0; i < smallres1.size(); i++) {
            finalres.add("h" + smallres1.get(i));
        }

        for (int i = 0; i < smallres2.size(); i++) {
            finalres.add("v" + smallres2.get(i));
        }

        return finalres;

    }

}