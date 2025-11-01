package textBook_Code.Pattern_Match.Pattern;

import java.util.regex.*;
import java.util.regex.PatternSyntaxException;

public class Pattern1 {
    public static void main(String[] args) {
        String regex = "hello\\d";
        try {
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher("hello1");
            boolean b = m.find();
            System.out.println(b);
        } catch (PatternSyntaxException e) {
            System.out.println("正则表达式语法错误：" + e.getDescription());
        }
    }
}
