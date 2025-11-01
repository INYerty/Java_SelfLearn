package textBook_Code.File;

import java.io.*;

public class Example10_2 {
    public static void main(String[] args) {
        File dir = new File("./src/textBook_Code/File");
        FileAccept fileAcc = new FileAccept();
        fileAcc.setExtendName("java");

        String fileName[] = dir.list(fileAcc);
        for(String name:fileName){
            System.out.println(name);
        }
    }
}
