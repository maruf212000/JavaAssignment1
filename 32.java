import java.io.*;

class Demo32
{
    public static void main(String args[])
    {
        try{
            FileInputStream f1 = new FileInputStream("11.txt");
            InputStreamReader i1 = new InputStreamReader(f1);
            int c;
            while((c = i1.read()) != -1)
            {
                System.out.print((char)c);
            }
            i1.close();
            f1.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}