import java.util.Scanner;
class Prime
  {
   public static void main(String args[])
        {
         int n,flag=0;
         Scanner s=new Scanner(System.in);
         System.out.println("Enter the number:");
         n=s.nextInt();
         for(int i=2;i<n;i++)
         {
            if(n%i==0)
              {
               flag=1;
               break;
              }
         }     
         if(n==0||n==1||flag==1)
           System.out.println(n+" is not prime");
         else
           System.out.println(n+" is prime number");        
        }
  }       
         

