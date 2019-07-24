import java.io.*;

class Demo20{
    public static void main(String args[])
    {
        try{
            FileInputStream f1 = new FileInputStream("4.txt");
            BufferedInputStream b1 = new BufferedInputStream(f1);
            int c,i=0;
            Byte[] b = new Byte[25];
            while((c = b1.read()) != -1)
            {
                if(i==25)
                    break; 
                b[i] = (byte)c;
                i++;
                System.out.println((char)c);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}