import java.util.Scanner;
class areashapes
     {
      void area(float r)
         { 
          int ar;
          ar=3.14*r*r;
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
          int ar;
          ar=r*r;
          System.out.print("Area is: "+ar);
         }       
     }
class test
    {
     Scanner s=new Scanner(System.in);
     System.out.print("Do you want to find the area of:\n1.Circle\n2.Rectangle\n3.Triangle");        
     ch=s.nextInt(); 
     areashapes obj=new areashapes();
     switch(ch)
       {
        case 1: System.out.print("Enter the radius:");
                float ra=s.nextInt();
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
      }
   }
   
   
   
   
   
   
   
   
   
   
   
               
                
