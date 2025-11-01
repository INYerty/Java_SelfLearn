package textBook_Code.File;

import java.io.File;
import java.io.IOException;

public class Example10_1 {
    public static void main(String[] args) {
        File f = new File("D:\\桌面\\教材源代码\\ch10\\例子1","Example10_1.java");
        System.out.println(f.getName()+"是可读的吗？"+f.canRead());
        System.out.println(f.getName()+"的长度"+f.length());
        System.out.println(f.getName()+"的绝对路径"+f.getAbsolutePath());
        File file = new File("new.txt");
        System.out.println("在当前目录下创建文件"+file.getName());
        if(!file.exists()){
            try {
                file.createNewFile();
                System.out.println("文件创建成功");
            }catch (IOException exp){

            }
        }
    }
}
