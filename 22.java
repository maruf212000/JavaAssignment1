import java.io.*;

class Demo22
{
    public static void main(String args[])
    {
        try{
            FileOutputStream f1 = new FileOutputStream("6.txt");
            BufferedOutputStream b1 = new BufferedOutputStream(f1);
            for(int i=0;i<=20;i++)
            {
                if(i%2==0)
                {
                    b1.write(i);
                }
            }
            b1.close();
            f1.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}