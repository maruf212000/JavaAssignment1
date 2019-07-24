import java.io.*;

class Demo9
{
    public static void main(String args[])
    {
        for(int i =0 ;i<5;i++)
        {
            File f = new File(args[i]);
            if(f.canWrite())
            {
                System.out.println(f + " is Writable");
            }
            else{
                System.out.println(f + " is not Writable");
            }
        }
    }
}