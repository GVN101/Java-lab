import java.util.Scanner;
class small
  {
   public static void main(String args[])
        {
         int n,sm;
         Scanner s=new Scanner(System.in);
         System.out.println("Enter the count:");
         n=s.nextInt();
         int arr[]=new int[n];
         System.out.println("Elements are:");
         for(int i=0;i<n;i++)
         {
            arr[i]=s.nextInt();
         }      
         sm=arr[0];  
         for(int i=1;i<n;i++)
             if(arr[i]<sm)
               sm=arr[i];
         System.out.println("Smallest element is: "+sm);
        }
  }       
         

