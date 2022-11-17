import java.util.Scanner;
class Transpose
    { 
     public static void main(String args[])
          {
           int r,c;
           Scanner s=new Scanner(System.in);
           System.out.println("Enter the no:- of rows:");
           r = s.nextInt();
           System.out.println("Enter the no:- of columns:");
           c = s.nextInt();
           int arr[][] = new int[r][c];
           for(int i=0;i<r;i++)
              for(int j=0;j<c;j++)
                 {
                  System.out.print("Enter the element in pos:("+i+","+j+"):");
                  arr[i][j] = s.nextInt();
                 }
           System.out.println("Transpose of given matrix is:");      
           for(int i=0;i<c;i++)
             {
              for(int j=0;j<r;j++)
                    System.out.print(arr[j][i]+"   ");
              System.out.print("\n");
             } 
          }
    }                 
