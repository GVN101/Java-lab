import java.util.Scanner;
class Secondlar
  {
   public static void main(String args[])
        {
         int count,lar,ind=0;
         Scanner s=new Scanner(System.in);
         System.out.println("Enter the count:");
         count=s.nextInt();
         int arr[]=new int[count];
         System.out.println("Enter the elements:");
         for(int i=0;i<count;i++)
            arr[i]=s.nextInt();
         lar=arr[0];
         for(int i=1;i<count;i++)
           if(arr[i]>lar)
             {
              lar=arr[i];
              ind=i;
             }
         arr[ind]=0;
         lar=arr[0];   
         for(int i=1;i<count;i++)
           if(arr[i]>lar)
             lar=arr[i];    
         System.out.println("Second largest element in the array is: "+lar);
        }
  }       
         

