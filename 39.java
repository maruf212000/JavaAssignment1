import java.io.*;

class Demo39
{
    public static void main(String args[])
    {
        try{
            FileWriter f1 = new FileWriter("16.txt");
            BufferedWriter b1 = new BufferedWriter(f1);
            b1.write("GLS University");
            b1.close();
            f1.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}