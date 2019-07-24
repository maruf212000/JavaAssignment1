import java.io.*;

class Demo15
{
    public static void main(String args[])
    {
        try{
            FileInputStream f1 = new FileInputStream("3.txt");
            byte b[] = new byte[100];
            int count = f1.read(b);
            ByteArrayInputStream b1 = new ByteArrayInputStream(b);
            int c;
            while((c = b1.read()) > count)
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