import java.util.Scanner;
class Matrixsum
    { 
     public static void main(String args[])
          {
           int r,c;
           Scanner s=new Scanner(System.in);
           System.out.println("Enter the no: of rows:");
           r = s.nextInt();
           System.out.println("Enter the no: of columns:");
           c = s.nextInt();
           int arr1[][] = new int[r][c];
           int arr2[][] = new int[r][c];
           int sum[][] = new int[r][c];
           System.out.println("Enter the First array=>");
           for(int i=0;i<r;i++)
              for(int j=0;j<c;j++)
                 {
                  System.out.print("Enter the element in pos:("+i+","+j+"):");
                  arr1[i][j] = s.nextInt();
                 }
           System.out.println("Enter the Second array=>");
           for(int i=0;i<r;i++)
              for(int j=0;j<c;j++)
                 {
                  System.out.print("Enter the element in pos:("+i+","+j+"):");
                  arr2[i][j] = s.nextInt();
                 }                  
           for(int i=0;i<r;i++)
              for(int j=0;j<c;j++) 
                  sum[i][j] = arr1[i][j]+arr2[i][j];     
           System.out.println("Sum of the arrays: ");
           for(int i=0;i<r;i++)
             {
              for(int j=0;j<c;j++) 
                   System.out.print(sum[i][j]+"    ");
              System.out.print("\n");
             }           
          }
    }                 
