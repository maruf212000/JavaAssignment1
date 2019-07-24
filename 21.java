import java.io.*;

class Demo21
{
    public static void main(String args[]) throws Exception
    {
        FileOutputStream f1 = new FileOutputStream("5.txt");
        BufferedOutputStream b1 = new BufferedOutputStream(f1);

        byte[] b = {76,77,78,79,80,81,82};
        b1.write(b);
        b1.close();
        f1.close();
    }
}