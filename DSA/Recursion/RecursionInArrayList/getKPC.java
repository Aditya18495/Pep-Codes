import java.io.*;
import java.util.*;

public class getKPC {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        ArrayList < String > ans = getKPC(str);
        System.out.print(ans);
    }
    
    static String[] keypad={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static ArrayList < String > getKPC(String str) {
        if(str.length()==0)
        {
            ArrayList<String> smallans=new ArrayList<>();
            smallans.add("");
            return smallans;
        }
        
        char ch=str.charAt(0);
        String ros=str.substring(1,str.length());
        ArrayList<String> smallres=getKPC(ros);
        ArrayList<String> fres=new ArrayList<>();
        
        String posschar=keypad[ch -'0'];
        
        for(int i=0;i<posschar.length();i++)
        {
            char ch1=posschar.charAt(i);
        
         for(int j=0;j<smallres.size();j++)
        {
            fres.add(ch1+smallres.get(j));
        }
        }
        
        return fres;
    }
    

}