import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by minlc on 2017/8/14.
 */
public class Example09 {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("writer.txt",true);  //若要在文件末尾追加数据，则需要加一个参数true
        String str = "你好，gtx测试！";
        writer.write(str);
        writer.write("\r\n");//将输出语句换行
        writer.close();
    }
}
