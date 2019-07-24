import java.io.*;

class Demo10
{
    public static void main(String args[])
    {
        try{
            FileInputStream fis = new FileInputStream("1.txt");
            FileOutputStream fos = new FileOutputStream("2.txt");
            int c;
            while((c = fis.read()) != -1)
            {
                fos.write(c);
            }
            System.out.println("Done!");
            fis.close();
            fos.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}