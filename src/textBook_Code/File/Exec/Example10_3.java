package textBook_Code.File.Exec;

import java.io.File;
//可执行文件
public class Example10_3 {
    public static void main(String[] args) {
        try{
            Runtime rt = Runtime.getRuntime();
            File file = new File("c:/windows","notepad.exe");
            rt.exec(file.getAbsolutePath());
            file = new File("C:\\program files\\internet explorer","IEXPLORE www.bilibili.com");
            rt.exec(file.getAbsolutePath());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}