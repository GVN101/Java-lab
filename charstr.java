import java.lang.*;
import java.util.Scanner;
class Pali
    {
     public static void main(String args[])
     { 
      int i=0;
      String rev="";
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the string:");
      String str=sc.nextLine();
      int l=str.length();
      for(i=l-i;i>=0;i--)
        rev=rev+str.charAt(i);
      if(str.equals(rev))
       System.out.println("Given string is a palindrome");
      else
       System.out.println("Given string is not a palindrome");
     }   
    }         
     
