import java.io.*;

class Demo30
{
    public static void main(String args[]) throws Exception
    {
        FileInputStream f1 = new FileInputStream("4.txt");
        byte b[] = new byte[100];
        f1.read(b);
        String s1 = new String(b);
        //System.out.println(s1);
        char c[] = s1.toCharArray();
        /*for(int i = 0 ; b[i] != '\0' ; i++)
        {
            c[i] = (char) b[i];
        }*/
        CharArrayReader c1 = new CharArrayReader(c);
        int a;
        while((a = c1.read()) != -1)
        {
            System.out.print((char)a);
        }
    }
}