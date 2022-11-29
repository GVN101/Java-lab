class Exception
    {
     public static void main(String args[])
         {
          int a[]={4,8};
          int b=0,c=4;
          try
            {
             int x=(a[0]/b);
            }
          catch(ArithmeticException e)
            {
             System.out.println("Arithmetic Exception..Division by zero!!");
            }
          try
            {
             int x=(a[20]/c);
            }
          catch(ArrayIndexOutOfBoundsException e)
            {
             System.out.println("Array index Out of bound!!\n"+e);
            }         
        }
    }          
