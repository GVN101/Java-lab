import java.util.Scanner;
class peri
     {
      peri(double ra)
         { 
          double p;
          p=2*3.14*ra;
          System.out.print("Perimeter of the circle is: "+p+"\n");
         } 
      peri(int l,int b)
         { 
          int p;
          p=2*(l+b);
          System.out.print("Perimeter of the rectangle is: "+p);
         } 
     }
class Perimeter
    {
     public static void main(String args[])
     {
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the length:");
     int l=s.nextInt(); 
     System.out.println("Enter the breadth:");
     int b=s.nextInt(); 
     System.out.println("Enter the radius:");
     double r=s.nextInt();        
     peri obj1=new peri(r);
     peri obj2=new peri(l,b);
     System.out.print("\n");
     }
   }
   
   
   
   
   
   
   
   
   
   
   
               
                
