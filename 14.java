import java.io.*;

class Demo14
{
    public static void main(String args[])
    {
        try{
                byte a[] = {12,13,14,15,16,17};
                ByteArrayInputStream b1 = new ByteArrayInputStream(a);
                int k;
                while((k = b1.read()) != -1)
                {
                    System.out.println(k);
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
    }
}
