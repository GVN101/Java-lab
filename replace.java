import java.util.Scanner;
class replace
  {
   public static void main(String args[])
        {
         int count,key,r;
         Scanner s=new Scanner(System.in);
         System.out.println("Enter the count:");
         count=s.nextInt();
         int arr[]=new int[count];
         System.out.println("Enter the array:");
         for(int i=0;i<count;i++)
            arr[i]=s.nextInt();
         System.out.println("Enter the key element:");
         key=s.nextInt();
         System.out.println("Enter the element to be replaced:");
         r=s.nextInt();
         for(int i=0;i<count;i++)
            if(arr[i]==r)
              arr[i]=key;
         System.out.print("New array is:");
         for(int i=0;i<count;i++)
            System.out.print(" "+arr[i]);
         System.out.println("\n");
        }
  }       
         

