import java.io.*;

class Demo31
{
    public static void main(String args[])
    {
        try{
            CharArrayWriter c1 = new CharArrayWriter();
            c1.write("GLS University");
            FileWriter f1 = new FileWriter("10.txt");
            FileWriter f2 = new FileWriter("11.txt");
            c1.writeTo(f1);
            c1.writeTo(f2);
            f1.close();
            f2.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}