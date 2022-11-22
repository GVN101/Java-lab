import java.util.Scanner;
class areas
     {
      void area(double ra)
         { 
          double ar;
          ar=3.14*ra*ra;
          System.out.print("Area is: "+ar);
         } 
      void area(int l,int b)
         { 
          int ar;
          ar=l*b;
          System.out.print("Area is: "+ar);
         } 
      void area(int b,float h)
         { 
          double ar;
          ar=0.5*b*h;
          System.out.print("Area is: "+ar);
         }       
     }
class areashapes
    {
     public static void main(String args[])
     {
     int ch;
     Scanner s=new Scanner(System.in);
     System.out.println("Do you want to find the area of:\n1.Circle\n2.Rectangle\n3.Triangle");        
     ch=s.nextInt(); 
     areas obj=new areas();
     switch(ch)
       {
        case 1: System.out.print("Enter the radius:");
                double ra=s.nextInt();
                obj.area(ra);
                break;
        case 2: System.out.print("Enter the length and breadth:");
                int le=s.nextInt();
                int br=s.nextInt();
                obj.area(le,br);
                break; 
        case 3: System.out.print("Enter the width and height:");
                int wi=s.nextInt();
                float hi=s.nextInt();
                obj.area(wi,hi);
                break;        
       default: System.out.print("Invalid choice!!");
      
      }System.out.print("\n");
     }
   }
   
   
   
   
   
   
   
   
   
   
   
               
                
