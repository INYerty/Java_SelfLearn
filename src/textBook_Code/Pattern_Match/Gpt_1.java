package textBook_Code.Pattern_Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Gpt_1 {
        public static void main(String[] args) {
            String text = "hello123world456hello789";
            String regex = "hello\\d+";  // 匹配 "hello" 后跟数字

            Pattern p = Pattern.compile(regex);//将表达式编译成模式
            Matcher m = p.matcher(text);//模式调用matcher 后加上要匹配的字符串

            while (m.find()) {
                System.out.println("匹配到: " + m.group());
                System.out.println("开始位置: " + m.start());
                System.out.println("结束位置: " + m.end());
                System.out.println("--------------");
            }
    }

}
