import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by minlc on 2017/8/14.
 */
public class Example02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream out = new FileOutputStream("example.txt");
        String str = "GTX";
        byte[] b = str.getBytes();
        for(int i=0; i<b.length; i++){
            out.write(b[i]);
        }
        out.close();
    }
}
