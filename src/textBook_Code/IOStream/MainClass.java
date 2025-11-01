package textBook_Code.IOStream;

import java.io.FileInputStream;
import java.io.IOException;

public class MainClass {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("src/textBook_Code/IOStream/MainClass.java")) {
            byte[] buffer = new byte[1024];
            int bytesRead = fis.read(buffer); // 读取数据
            if (bytesRead != -1) {
                System.out.println("读取到的字节数: " + bytesRead);
                System.out.println("内容: " + new String(buffer, 0, bytesRead));
            } else {
                System.out.println("文件为空或已到末尾。");
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
