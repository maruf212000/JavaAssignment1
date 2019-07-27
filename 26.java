import java.io.*;

class Demo26
{
    public static void main(String args[]) throws Exception
    {
        FileInputStream f1 = new FileInputStream("3.txt");
        FileInputStream f2 = new FileInputStream("4.txt");

        SequenceInputStream s1 = new SequenceInputStream(f1,f2);

        int c;
        while((c = s1.read()) != -1)
        {
            System.out.println((char)c);
        }
    }
}