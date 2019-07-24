import java.io.*;

class Demo2
{
    public static void main(String args[])
    {
        File f = new File("D:/");
        String files[] = f.list();
        for(String file : files)
        {
            System.out.println(file);
        }
    }
}