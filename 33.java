import java.io.*;

class Demo33
{
    public static void main(String args[])
    {
        try{
            FileOutputStream f1 = new FileOutputStream("12.txt");
            OutputStreamWriter i1 = new OutputStreamWriter(f1);
            char c[] = { 'a','e','i','o','u'}; 
            i1.write(c,0,5);
            i1.close();
            f1.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}