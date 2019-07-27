import java.io.*;
import java.io.ObjectInputStream;

class Demo28
{
    public static void main(String args[])
    {
        try{
            FileInputStream f1 = new FileInputStream("8.txt");
            ObjectInputStream o1 = new ObjectInputStream(f1);

            System.out.println((String)o1.readObject());
            byte b1[] = (byte[]) o1.readObject();
            String s1 = new String(b1);
            System.out.println(s1);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}