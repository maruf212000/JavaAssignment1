import java.io.*;
import java.util.*;

class Demo41
{
    public static void main(String args[]) throws Exception
    {
        FileInputStream f1 = new FileInputStream("4.txt");
        byte b[] = new byte[100];
      //  f1.read(b);
        int c,j=0;
        while((c = f1.read()) != -1)
        {
            b[j] = (byte) c;
            j++;
        }
        String s1 = new String(b);
       // System.out.println(s1.length());
       // System.out.println(s1.reverse());
        for(int i=j ;i>=0;i--)
        {
            System.out.print((char)b[i]);
        }
    }
}