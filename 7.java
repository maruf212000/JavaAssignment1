import java.util.Scanner;
import java.io.*;

class Demo7
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        String s = sc.nextLine();
        File f = new File(s);
        if(f.isFile())
        {
            System.out.println(f + " is a File");
        }
        else{
            System.out.println(f + " is not a File");
        }
    }
}
