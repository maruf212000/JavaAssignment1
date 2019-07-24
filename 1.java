import java.io.*;

class Demo1
{ 
    public static void main(String args[])
    {
        File f1 = new File("1.java");
        if(f1.exists())
        {
            System.out.println(f1 + " exists");
        }
        else
        {
            System.out.println(f1 + " doesn't exists");
        }
    }
}