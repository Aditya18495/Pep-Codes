import java.io.*;
import java.util.*;

public class getMazePathsWithJumps {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int r=scn.nextInt();
        int c=scn.nextInt();
        ArrayList<String> ans=getMazePaths(0,0,r-1,c-1);
        System.out.println(ans);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList < String > getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr==dr && sc==dc)
        {
            ArrayList<String> tempres=new ArrayList<>();
            tempres.add("");
            return tempres;
        }
        
        if(sr>dr || sc>dc)
        {
            ArrayList<String> tempres=new ArrayList<>();
            //tempres.add("");
            return tempres;
        }
        
        ArrayList<String> finalres=new ArrayList<>();
        
        for(int jump=1;jump<=dc-sc;jump++)
        {
            ArrayList<String> smallres1=getMazePaths(sr,sc+jump,dr,dc);
            for(int i=0;i<smallres1.size();i++)
            {
                finalres.add("h"+jump+smallres1.get(i));
            }
        }
        
         for(int jump=1;jump<=dr-sr;jump++)
        {
            ArrayList<String> smallres2=getMazePaths(sr+jump,sc,dr,dc);
            for(int i=0;i<smallres2.size();i++)
            {
                finalres.add("v"+jump+smallres2.get(i));
            }
        }
        
         for(int jump=1;jump<=Math.min(dr-sr,dc-sc);jump++)
        {
            ArrayList<String> smallres3=getMazePaths(sr+jump,sc+jump,dr,dc);
            for(int i=0;i<smallres3.size();i++)
            {
                finalres.add("d"+jump+smallres3.get(i));
            }
        }
        
        return finalres;
        
        
    }

}