import java.io.*;

/**
 * Created by minlc on 2017/8/14.
 */
public class Example04 {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("source\\test.pdf");
        OutputStream out = new FileOutputStream("target\\test.pdf");
        int len;
        long beginTime = System.currentTimeMillis();
        while((len=in.read()) != -1){
            out.write(len);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("拷贝文件所消耗的时间是：" + (endTime - beginTime) + "毫秒");
        in.close();
        out.close();
    }
}
