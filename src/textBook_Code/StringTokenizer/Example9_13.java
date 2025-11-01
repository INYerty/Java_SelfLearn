package textBook_Code.StringTokenizer;

import java.util.*;

public class Example9_13 {
    public static void main(String[] args) {
        String s = "you are welcome(thank you),nice to meet you";
        StringTokenizer stk = new StringTokenizer(s,"(),");
        //StringTokenizer 的分隔符集合是“或”的关系，
        // 遇到其中任意一个就切分；没有顺序问题，只和原字符串中符号出现的先后顺序有关。
        int number = stk.countTokens();
        while(stk.hasMoreTokens()){
            String str = stk.nextToken();
            System.out.print(str+" ");
        }
        System.out.println("共有单词："+number+"个");
    }
}
