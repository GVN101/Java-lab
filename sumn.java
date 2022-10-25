import java.util.Scanner;
class sumn
  {
   public static void main(String args[])
        {
         int n,sum=0;
         Scanner s=new Scanner(System.in);
         System.out.println("Enter the number:");
         n=s.nextInt();
         for(int i=1;i<=n;i++)
            sum+=i;
           System.out.println("Sum is "+sum);        
        }
  }       
         

