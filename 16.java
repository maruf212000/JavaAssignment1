import java.io.*;

class Demo16
{
    public static void main(String args[])
    {
        try{
            byte[] b = args[0].getBytes();
            ByteArrayOutputStream b1 = new ByteArrayOutputStream();
            b1.write(b);
            FileOutputStream f1 = new FileOutputStream("4.txt");
            b1.writeTo(f1);
            FileInputStream f2 = new FileInputStream("4.txt");
            int c;
            while((c = f2.read()) != -1)
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