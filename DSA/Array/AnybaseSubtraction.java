import java.util.*;
  
  public class AnybaseSubtraction{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int b, int n1, int n2){
       // write your code here
       int dec1=0;
       int pow=1;
       while(n1!=0)
       {
           int dig=n1%10;
           n1=n1/10;
           dec1+=dig*pow;
           pow=pow*b;
       }
       
        int dec2=0;
       int p=1;
       while(n2!=0)
       {
           int d=n2%10;
           n2=n2/10;
           dec2+=d*p;
           p=p*b;
       }
       
       int f=dec1-dec2;
       if(f<0)
       {
           f=f*(-1);
       }
        int fin=0;
       int power=1;
       while(f!=0)
       {
           int digit=f%b;
           f=f/b;
           fin+=digit*power;
           power=power*10;
       }
       
       return fin;
   }
  
  }