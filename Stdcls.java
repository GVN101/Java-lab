import java.lang.String;
import java.util.Scanner;
class Student
    {
        static Scanner s=new Scanner(System.in);
        String name;
        int rollno;
        int mark[]=new int[5];
        void read()
           { 
            System.out.print("Enter the Student name:");
            name=s.next();
            System.out.print("Roll No:"); 
            rollno=s.nextInt();
            System.out.print("Enter the 5 marks:\n");
            for(int i=0;i<5;i++)
               mark[i]=s.nextInt();
           }
        void display()
           { 
            System.out.println("Student name:"+name);
            System.out.println("Roll No:"+rollno); 
            System.out.print("The marks are:\t");
            for(int i=0;i<5;i++)
               System.out.print(mark[i]+"\t");
            System.out.println("\n");   
           }       
    } 
class Stdcls
     {
         public static void main(String args[])
              {
                Scanner sc=new Scanner(System.in);
                int n;
                System.out.println("Enter the number of students");
                n=sc.nextInt();
                Student stlist[]=new Student[n];
                for(int i=0;i<n;i++){
                System.out.println("Enter the Student details of Student "+(i+1)+":\n");
                stlist[i]=new Student();  
                stlist[i].read();
                System.out.println("");
                }
                for(int i=0;i<n;i++){
                System.out.print("Entered details of Student "+(i+1)+":\n");  
                stlist[i].display();
                System.out.println("");
                }
              }
     }           
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                          
     
