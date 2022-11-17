import java.lang.String;
import java.util.Scanner;
class strfreq
    {
     public static void main(String args[])
     { 
      int f=0;
      char c;
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the string:");
      String str=sc.nextLine();
      int l=str.length();
      System.out.print("Enter the element to be searched:");
      c=sc.next().charAt(0);
      for(int i=0;i<l;i++)
         if(c==str.charAt(i))
            f++;
      if(f==0)   
        System.out.println("Character not found!!");
      else
        System.out.println("element is present:"+f+" times");   
     }   
    }         
     
