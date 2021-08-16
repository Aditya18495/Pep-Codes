import java.io.*;
import java.util.*;

public class getSubsequence {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        ArrayList<String> ans=gss(str);
        System.out.print(ans);

    }

    public static ArrayList < String > gss(String str) {
        if(str.length()==0)
        {
            ArrayList<String> smallans=new ArrayList<>();
            smallans.add("");
            return smallans;
        }
        
        char ch=str.charAt(0);
        String ros=str.substring(1,str.length());
        ArrayList<String> withoutcharans=gss(ros);
        
        ArrayList<String> withcharans=new ArrayList<>();
        
        for(int i=0;i<withoutcharans.size();i++)
        {
            withcharans.add(withoutcharans.get(i));
        }
        
        for(int i=0;i<withoutcharans.size();i++)
        {
            withcharans.add(ch+ withoutcharans.get(i));
        }
        
        return withcharans;
    }

}