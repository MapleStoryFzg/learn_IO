import java.io.*;

/**
 * Created by minlc on 2017/8/14.
 */
public class Example05 {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("source\\test.pdf");
        OutputStream out = new FileOutputStream("target\\test.pdf");
        //以下使用缓冲区读写文件
        byte[] buff = new byte[1024];
        int len;
        long beginTime = System.currentTimeMillis();
        while((len=in.read(buff)) != -1){
            out.write(buff,0,len);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("拷贝文件所消耗的时间是：" + (endTime - beginTime) + "毫秒");
        in.close();
        out.close();
    }
}
