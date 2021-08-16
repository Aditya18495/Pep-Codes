import java.io.*;
import java.util.*;

public class DifferenceofConsecutiveCharacters {

	public static String solution(String str){
		// write your code here
		StringBuilder sb=new StringBuilder(str);
		String ss=sb.charAt(0)+ "";
		for(int i=1;i<sb.length();i++)
		{
		    char ch1=sb.charAt(i);
		    char ch2=sb.charAt(i-1);
		    int count= ch1-ch2;
		    ss=ss+count+sb.charAt(i);
		}

		return ss;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}