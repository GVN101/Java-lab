import java.util.Scanner;
class Fibonacci
  {
   public static void main(String args[])
        {
         int a=0,b=1,c,count;
         Scanner s=new Scanner(System.in);
         System.out.println("Enter the count:");
         count=s.nextInt();
         System.out.println("The series is:");
         System.out.print("0  1");
         for(int i=2;i<count;i++)
         {
            c=a+b;
            System.out.print("  "+c);
            a=b;
            b=c;
         }        
         System.out.println("\n");
        }
  }       
         

