import java.io.*;
import java.util.*;

public class printKPC {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        printKPC(str,"");
    }
    static String[] keypad = {
        ".;",
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs",
        "tu",
        "vwx",
        "yz"
    };

    public static void printKPC(String str, String ans) {
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }
        
        char ch=str.charAt(0);
        String ros=str.substring(1);
        
        String posschar=keypad[ch-'0'];
        
        for(int i=0;i<posschar.length();i++)
        {
            char tobeexp=posschar.charAt(i);
            printKPC(ros,ans+tobeexp);
        }
    }

}