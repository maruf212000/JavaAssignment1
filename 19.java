import java.io.*;

class Demo19
{
    public static void main(String args[])
    {
        try{
            FileInputStream f1 = new FileInputStream("4.txt");
            BufferedInputStream b1 = new BufferedInputStream(f1);
            int c;

            while((c = b1.read()) != -1)
            {
                System.out.println((char)c);
                b1.read();
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}