import java.util.Scanner;
class Trace
    { 
     public static void main(String args[])
          {
           int r,c,trace=0;
           Scanner s=new Scanner(System.in);
           System.out.println("Enter the no:- of rows:");
           r = s.nextInt();
           System.out.println("Enter the no:- of columns:");
           c = s.nextInt();
           int arr[][] = new int[r][c];
           int tr[][] = new int[c][r];
           for(int i=0;i<r;i++)
              for(int j=0;j<c;j++)
                 {
                  System.out.print("Enter the element in pos:("+i+","+j+"):");
                  arr[i][j] = s.nextInt();
                 }     
           for(int i=0;i<c;i++)
              for(int j=0;j<r;j++)
                 if(i==j)
                   trace+=arr[i][j];
           System.out.println("Trace of given matrix is:"+trace);         
          }
    }                 
