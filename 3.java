import java.io.*;

class Demo3
{
    public static void main(String args[])
    {
        File f = new File("1.java");
        if(f.canWrite())
        {
            System.out.println(f + " is writable");
        }
        else{
            System.out.println(f + " is not writable");
        }
    }
}