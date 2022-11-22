import java.lang.String;
import java.util.Scanner;
class Employee
    {
        static Scanner s=new Scanner(System.in);
        String name;
        int age,salary;
        long phnno;
        String address = new String();
        void read()
           { 
            System.out.print("Enter the Employee name:");
            name=s.next();
            System.out.print("Employee age:"); 
            age=s.nextInt();
            System.out.print("Enter the Phone Number:");
            String str = s.next();
            phnno =Long.parseLong(str);
            System.out.print("Enter the employee Address:");
            address=s.next();
            System.out.print("Employee salary:");
            salary = s.nextInt(); 
           }
        void display()
           { 
            System.out.println("\t--------------\t--------------\t--------------\t--------------\t");
            System.out.println("Employee name:"+name);
            System.out.println("Employee age:"+age); 
            System.out.println("Employee Phone Number: "+ phnno);
            System.out.println("Employee address:\n"+address); 
           }    
        void print_Salary()
           {
             System.out.println("Employee salary:"+salary);
           }   
                  
    } 
class Officer extends Employee
    {
     String spe;
     String dep;
     void det()
          {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the Specialization:"); 
            spe=sc.next();
            System.out.print("Enter the Department:");
            dep=sc.next(); 
          }
     void dis()
         {
            System.out.println("Employee specialization:"+spe);
            System.out.println("Employee department:"+dep); 
         }       
    }  
class manager extends Employee
    {
     String spe1;
     String dep1;
     void det()
          {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the Specialization:"); 
            spe1=sc.next();
            System.out.print("Enter the Department:");
            dep1=sc.next(); 
          }
     void dis()
         {
            System.out.println("Employee specialization:"+spe1);
            System.out.println("Employee department:"+dep1); 
         }        
    }            
           
        
class employee_detadv
     {
         public static void main(String args[])
              {
                Scanner sc=new Scanner(System.in);
                Officer obj1=new Officer();
                obj1.read();
                obj1.det();
                obj1.display();
                obj1.dis();
                obj1.print_Salary();
                System.out.println("\n");
                manager obj2=new manager();
                obj2.read();
                obj2.det();
                obj2.display();
                obj2.dis();
                obj2.print_Salary();
             }
    }                        
