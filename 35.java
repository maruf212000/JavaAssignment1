import java.io.*;

class Demo35
{
    public static void main(String args[]) throws Exception
    {
        FileWriter f1 = new FileWriter("13.txt");
        f1.write("Name");
        f1.write("Address");
        f1.close();
    }
}