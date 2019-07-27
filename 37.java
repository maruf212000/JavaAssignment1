import java.io.*;

class Demo37
{
    public static void main(String args[])
    {
        try{
            FileReader f1 = new FileReader("15.txt");
            for(int i=0;i<5;i++)
            {
                System.out.print((char)f1.read());
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}