import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by minlc on 2017/8/14.
 */
public class Example03 {
    public static void main(String[] args) throws IOException {
        OutputStream out = new FileOutputStream("example.txt",true);
        String str = "欢迎您！";
        byte[] b = str.getBytes();
        for(int i=0; i<b.length; i++){
            out.write(b[i]);
        }
        out.close();
    }
}
