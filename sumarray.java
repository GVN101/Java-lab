import java.util.Scanner;
class sumarray
  {
   public static void main(String args[])
        {
         int n,sum=0;
         Scanner s=new Scanner(System.in);
         System.out.println("Enter the number of elements:");
         n=s.nextInt();
         int arr[]=new int[n];
         System.out.println("Enter the elements:");
         for(int i=0;i<n;i++)
         {
           arr[i]=s.nextInt();
           sum+=arr[i];
         }        
         System.out.println("Sum is:"+sum);
        }
  }       
         

