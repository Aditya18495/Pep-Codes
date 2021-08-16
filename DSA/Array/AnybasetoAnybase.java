import java.util.*;
  
  public class AnybasetoAnybase{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sB = scn.nextInt();
     int  dB= scn.nextInt();
     
     int num=0;
     int pow=1;
     while(n!=0)
     {
         int dig=n%10;
         n=n/10;
         num+=dig*pow;
         pow=pow*sB;
     }
     
     int f=0;
     int p=1;
     while(num!=0)
     {
         int d=num%dB;
         num=num/dB;
         f+=d*p;
         p=p*10;
     }
     System.out.println(f);
   }   
  }