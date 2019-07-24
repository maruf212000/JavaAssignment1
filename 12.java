import java.io.*;

class Demo12
{
    public static void main(String args[])
    {
        byte a[] = {12,45,65,78,96};
        File f1 = new File("3.txt");
        try{
                FileOutputStream fos = new FileOutputStream(f1);
                    fos.write(a);
                FileInputStream fis = new FileInputStream(f1);
                int c;
                while((c = fis.read()) != -1)
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