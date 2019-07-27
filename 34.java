import java.io.*;

class Demo34
{
    public static void main(String args[])
    {
        try{
            FileReader fr = new FileReader("12.txt");
            int c;
            while((c = fr.read()) != -1)
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