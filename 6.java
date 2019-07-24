import java.io.*;

class Demo6
{
    public static void main(String args[])
    {
        File f = new File("try.");
        System.out.println("File Name:- " + f.getName());
        System.out.println("File Path:- " + f.getPath());
        System.out.println("File Parent:- " + f.getParent());
    }
}