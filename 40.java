import java.io.*;

class Demo40
{
    public static void main(String args[])
    {
        try{
            FileInputStream f1 = new FileInputStream("4.txt");
            int c,count=0;
            while((c = f1.read()) != -1)
            {
                if((char)c == 'a')
                {
                    count++;
                }
            }
            System.out.println("Total Occurence of a is " + count);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}