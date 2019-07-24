import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
class demo {
    public static void main(String[] args) throws Exception {
        File file = new File("write.txt");
        FileInputStream fis = new FileInputStream(file);
        byte[] b = new byte[(int)file.length()];
        fis.read(b);
        fis.close();
        ByteArrayInputStream bArray = new ByteArrayInputStream(b);
        int i;
        String str="";
        while ((i = bArray.read()) != -1) {
            str = Character.toString(i);
            System.out.print(str.toUpperCase());
        }
    }
}