import java.lang.String;
import java.util.Scanner;
class Employee
    {
        static Scanner s=new Scanner(System.in);
        String name;
        int empno;
        long phnno;
        void read()
           { 
            System.out.print("Enter the Employee name:");
            name=s.next();
            System.out.print("Employee No:"); 
            empno=s.nextInt();
            System.out.print("Enter the Phone Number:");
            String str = s.next();
            phnno =Long.parseLong(str);
           }
        void display()
           { 
            System.out.println("\t--------------\t--------------\t--------------\t--------------\t");
            System.out.println("Employee name:"+name);
            System.out.println("Employee No:"+empno); 
            System.out.print("Employee Phone Number: ");
            System.out.print(phnno);
            System.out.println("\n");   
           }       
    } 
class employee_det
     {
         public static void main(String args[])
              {
                Scanner sc=new Scanner(System.in);
                int n;
                System.out.println("Enter the number of employee:");
                n=sc.nextInt();
                Employee emlist[]=new Employee[n];
                for(int i=0;i<n;i++){
                System.out.println("Enter the Employee details of Employee "+(i+1)+ ":\n");
                emlist[i]=new Employee();  
                emlist[i].read();
                System.out.println("");
                }
                for(int i=0;i<n;i++){
                System.out.print("Entered details of Employee "+(i+1)+":\n");  
                emlist[i].display();
                System.out.println("");
                }
              }
     }           
