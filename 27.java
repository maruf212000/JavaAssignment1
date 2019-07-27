import java.io.*;

class Demo27
{
    public static void main(String args[])
    {
        String s1 = "GLS UNiversity";
        byte b[] = {1,2,3,4,5,6,7,8,9,0};
        try
        {
            FileOutputStream f1 = new FileOutputStream("8.txt");
            ObjectOutputStream o1 = new ObjectOutputStream(f1);

            o1.writeObject(s1);
            o1.writeObject(b);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}