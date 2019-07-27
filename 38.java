import java.io.*;

class Demo38
{
    public static void main(String args[])
    {
        try{
            FileReader f1 = new FileReader("15.txt");
            BufferedReader b1 = new BufferedReader(f1);
            int c; 
            while((c = b1.read()) != -1)
            {
                System.out.print((char)c);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}