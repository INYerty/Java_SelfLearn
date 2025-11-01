package textBook_Code.Pattern_Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example9_19 {
    public static void main(String[] args) {
        Pattern p;
        Matcher m;
        String regex = "(http://|www)\56?\\w+\56{1}\\w+\56{1}\\w+\56{1}\\p{Alpha}+";
        p = Pattern.compile(regex);
        String s = "清华大学网址：http://www.tsinghua.edu.cn,人民邮电出版社：www.ptpress.com.cn";
        m = p.matcher(s);
        while(m.find()){
            String str = m.group();
            System.out.println(str);
        }
        System.out.println("剔除字符串中的网站地址后得到的字符串：");
        String result = m.replaceAll("");
        System.out.println(result);
    }
}
/*import java.util.regex.*;

public class ReplaceFirstExample {
    public static void main(String[] args) {
        String text = "hello123 hello456 hello789";
        Pattern p = Pattern.compile("hello\\d+");
        Matcher m = p.matcher(text);

        // 替换第一个匹配
        String result1 = m.replaceFirst("HI");
        System.out.println("replaceFirst: " + result1);

        // 替换所有匹配
        m = p.matcher(text);
        String result2 = m.replaceAll("HI");
        System.out.println("replaceAll: " + result2);
    }
}
*/