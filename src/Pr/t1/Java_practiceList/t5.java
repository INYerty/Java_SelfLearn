package Pr.t1.Java_practiceList;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.io.File;
import java.util.Scanner;

/*【五、输入输出与文件】
*/
public class t5 {
    public static void main(String[] args) {

//        13. 使用 Scanner 输入求平均值 (Scanner)
//    ➤ 从键盘输入一组整数（以空格分隔），
//        计算并输出它们的平均值。
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String[] s = str.split(" ");
//        int[] nums = new int[s.length];
//        int sum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = Integer.parseInt(s[i]);
//            sum += nums[i];
//        }
//        System.out.print((double) sum/(nums.length));



//        14. 从文件读取并统计单词数 (C File, StringTokenizer)
//    ➤ 从文件 data.txt 中读取多行文本，
//        输出每行的单词数量。
        File f = new File("D:\\JavaSelfLearn\\Test\\src\\Pr\\t1\\Java_practiceList\\data.txt");
        if(f.exists()){
            try{
                Scanner sc = new Scanner(f);
                int sum = 0;
                while(sc.hasNextLine()){
                    String line = sc.nextLine();
                    String[] words = line.split(" ");
                    sum+= words.length;
                }
                System.out.println("单词总数为："+sum);
                sc.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
