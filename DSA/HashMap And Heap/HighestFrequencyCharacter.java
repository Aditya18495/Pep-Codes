import java.io.*;
import java.util.*;

public class HighestFrequencyCharacter {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    String str=scn.nextLine();
    HashMap<Character,Integer> map=new HashMap<>();
    int max=0;
    char maxfreq=' ';
    for(int i=0;i<str.length();i++)
    {
        char ch=str.charAt(i);
        
        if(map.containsKey(ch)==true)
        {
            int count=map.get(ch);
            count++;
            map.put(ch,count);
        }else
        {
            map.put(ch,1);
        }
        if(map.get(ch)>max)
        {
            max=map.get(ch);
            maxfreq=ch;
        }
    }
    System.out.println(maxfreq);
    
  }

}