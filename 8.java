import javax.swing.*;
import java.io.*;

class Demo8
{
    public static void main(String args[])
    {
        String s = JOptionPane.showInputDialog(null,"Enter the string");
        File f = new File(s);
        if(f.isDirectory())
        {
            JOptionPane.showMessageDialog(null,f + " is Directory");
        }
        else{
            JOptionPane.showMessageDialog(null,f+ " is not Directory");
        }
    }
}