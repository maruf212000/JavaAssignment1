import java.io.*;

class Demo4
{
    public static void main(String args[])
    {
        File f = new File("1.java");
        if(f.canRead())
        {
            System.out.println(f + " is readable");
        }
        else{
            System.out.println(f + " is not readable");
        }
    }
}