import java.io.*;

/**
 * Created by minlc on 2017/8/14.
 */
public class Example07 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("des.txt"));
        int len;
        while ((len = bis.read()) != -1){
            bos.write(len);
        }
        bis.close();
        bos.close();
    }
}
