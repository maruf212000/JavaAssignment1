import java.io.*;

class Demo18
{
    public static void main(String args[])
    {
        try{
            FileInputStream fin = new FileInputStream("4.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);
            System.out.println("Available Bytes:- " + bin.available());
            System.out.println("Mark Supported:- " + bin.markSupported());
            int c;
            while((c = bin.read()) != -1)
            {
                System.out.println((char)c);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}