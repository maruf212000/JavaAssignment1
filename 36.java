import java.io.*;

class Demo36
{
    public static void main(String args[]) throws Exception
    {
        RandomAccessFile f1 = new RandomAccessFile("14.txt","r");
        int c = f1.read();
        System.out.println((char)c);
        f1.seek(4);
        c = f1.read();
        System.out.println((char)c);
        f1.seek(8);
        c = f1.read();
        System.out.println((char)c);
    }
}