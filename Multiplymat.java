import java.util.Scanner;
class Multiplymat
    { 
     public static void main(String args[])
          {
           int r1,c1,r2,c2;
           Scanner s=new Scanner(System.in);
           System.out.println("Enter the no: of rows in First matrix:");
           r1 = s.nextInt();
           System.out.println("Enter the no: of columns in First matrix:");
           c1 = s.nextInt();
           int arr1[][] = new int[r1][c1];
           System.out.println("Enter the First array=>");
           for(int i=0;i<r1;i++)
              for(int j=0;j<c1;j++)
                 {
                  System.out.print("Enter the element in pos:("+i+","+j+"):");
                  arr1[i][j] = s.nextInt();
                 }
           System.out.println("Enter the no: of rows in Second matrix:");
           r2 = s.nextInt();
           System.out.println("Enter the no: of columns in Second matrix:");
           c2 = s.nextInt(); 
           if(c1==r2)
           {     
           int arr2[][] = new int[r2][c2];
           int pro[][] = new int[r1][c2];
           System.out.println("Enter the Second array=>");
           for(int i=0;i<r2;i++)
              for(int j=0;j<c2;j++)
                 {
                  System.out.print("Enter the element in pos:("+i+","+j+"):");
                  arr2[i][j] = s.nextInt();
                 }                  
           for(int i=0;i<r1;i++)
              for(int j=0;j<c2;j++)
                {
                 pro[i][j]=0;
                 for(int k=0;k<c1;k++) 
                     pro[i][j] += arr1[i][k]*arr2[k][j];
                }          
           System.out.println("Product of the arrays: ");
           for(int i=0;i<r1;i++)
             {
              for(int j=0;j<c2;j++) 
                   System.out.print(pro[i][j]+"    ");
              System.out.print("\n");
             }           
          }
          else
            System.out.println("invalid order of matrices!!");
          }
    }                 
