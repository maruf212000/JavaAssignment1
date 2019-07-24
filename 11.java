import java.io.*;

class Demo11
{
    public static void main(String args[])
    {
            int a[] = {23,45,56,76,87,90,34,67};
        try{    
            FileOutputStream fos1 = new FileOutputStream("even.dat");
            FileOutputStream fos2 = new FileOutputStream("odd.dat");

            for(int i=0;i<8;i++)
            {
                if(a[i]%2==0)
                {
                    fos1.write(a[i]);
                    System.out.println("Odd");
                }
                else
                {
                    fos2.write(a[i]);
                    System.out.println("Even");
                }
            }
            int c;
            FileInputStream fis1 = new FileInputStream("even.dat");
             System.out.println("Even Numbers");
             while((c = fis1.read()) != -1)
             {
                 System.out.println(c);
             }
             FileInputStream fis2 = new FileInputStream("odd.dat");
             System.out.println("Odd Numbers");
             while((c = fis2.read()) != -1)
              {
                 System.out.println(c);
             }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}