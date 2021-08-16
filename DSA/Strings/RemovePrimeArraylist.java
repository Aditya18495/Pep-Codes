import java.io.*;
import java.util.*;

public class RemovePrimeArraylist {
    
    public static boolean isPrime(int val)
    {
        int c=0;
        for(int i=2;i*i<=val;i++)
        {
            if(val%i==0)
            {
                c++;
                break;
            }
        }
        if(c!=0)
        {
            return false;
        }else
        {
            return true;
        }
    }

	public static void solution(ArrayList<Integer> al){
		for(int i=al.size()-1;i>=0;i--)
		{
		    int val=al.get(i);
		    if(isPrime(val)==true)
		    {
		        al.remove(i);
		    }
		}
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}

}