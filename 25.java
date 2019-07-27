import java.io.*;

class Demo25
{
    public static void main(String args[]) throws Exception
    {
        FileOutputStream f1 = new FileOutputStream("7.dat");
        DataOutputStream d1 = new DataOutputStream(f1);
        d1.writeBoolean(true);
        d1.writeChar('a');
        d1.writeInt(1);
        d1.writeFloat(3.4f);
        d1.writeDouble(4.555);
        d1.close();
        f1.close();

        FileInputStream f2 = new FileInputStream("7.dat");
        DataInputStream d2 = new DataInputStream(f2);
        Boolean b = d2.readBoolean();
        char c = d2.readChar();
        int i = d2.readInt();
        float f = d2.readFloat();
        Double d= d2.readDouble();
        System.out.println(b);
        System.out.println(c);
        System.out.println(i);
        System.out.println(f);
        System.out.println(d);
    }
}