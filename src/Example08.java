import java.io.FileReader;
import java.io.IOException;

/**
 * Created by minlc on 2017/8/14.
 */
public class Example08 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("reader.txt");
        int ch;
        while ((ch = reader.read()) != -1){
            System.out.println((char) ch);
        }
        reader.close();
    }
}
