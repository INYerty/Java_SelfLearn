package textBook_Code.IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class MainClass2 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("src/textBook_Code/IOStream/MainClass.java")) {

            byte[] buffer = new byte[1024];
            int bytesRead; // 存放每次读到的字节数

            // 只读一次，并将结果保存在 bytesRead 中
            while ((bytesRead = fis.read(buffer)) != -1) {
                System.out.println("读取到的字节数: " + bytesRead);
                System.out.println("内容：" + new String(buffer, 0, bytesRead));
            }

            System.out.println("✅ 文件读取完毕（到达末尾）");
            fis.close();

        } catch (FileNotFoundException e) {
            System.out.println("❌ 文件未找到！");
        } catch (IOException e) {
            System.out.println("❌ 读取文件出错：" + e.getMessage());
        }
    }
}
