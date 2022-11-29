abstract class Shape
     {
      abstract void numberOfSides();
     }
class Rectangle extends Shape
     {
      void numberOfSides()  
         {
          System.out.println("Number of sides of a Rectangle is 4");
         }
     } 
class Triangle extends Shape
     {
      void numberOfSides()  
         {
          System.out.println("Number of sides of a Triangle is 3");
         }
     }    
class Hexagon extends Shape
     {
      void numberOfSides()  
         {
          System.out.println("Number of sides of a Hexagon is 6");
         }
     }                  
class sides
    { 
     public static void main(String args[])
          {
           Shape s1=new Rectangle();
           s1.numberOfSides();
           Shape s2=new Triangle();
           s2.numberOfSides();
           Shape s3=new Hexagon();
           s3.numberOfSides();
          }
    }       
           
                   
       
       
       
       
       
       
       
       
       
