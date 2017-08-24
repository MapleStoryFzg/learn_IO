import java.io.FileInputStream;

/**
 * Created by minlc on 2017/8/14.
 */
public class Example01 {
    public static void main(String[] args) throws Exception {
        //创建一个文件字节输入流
        FileInputStream in = new FileInputStream("test.txt");
        int b = 0;              //定义一个int类型的变量b，记住每次读取的一个字节
        while (true){
            b = in.read();      //变量b记住读取的一个字节
            if(b==-1){          //如果读取的字节为-1，跳出while循环
                break;
            }
            System.out.println(b);      //否则将b输出
        }
        in.close();

    }
}
