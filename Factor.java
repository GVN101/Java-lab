import java.util.Scanner;
class Factor
  {
   public static void main(String args[])
        {
         int n;
         Scanner s=new Scanner(System.in);
         System.out.println("Enter the number:");
         n=s.nextInt();
         System.out.println("The Factors are: ");
         for(int i=1;i<=n;i++)
            if(n%i==0)
              System.out.println(i);     
        }
  }       
         

