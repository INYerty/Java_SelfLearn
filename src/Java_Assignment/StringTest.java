package Java_Assignment;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // String substring(int start,int end)
        // 截取字符串，传入的两个参数分别为要截取边界的下标
        // 在java api 中,通常使用两个数字表示范围时,都是含头不含尾,即包含起始下标对应的内容,但不包含结束下标的处对应的内容
        // String toUpperCase() 将当前字符串中的英文部分转换为全大写
        /********* Begin *********/

        Pattern p = Pattern.compile("www\\.([^.]+)\\.");
        Matcher m = p.matcher(str);
        if (m.find()) {
            String domain = m.group(1); // 提取第1个捕获组，即baidu
            System.out.println(domain);
            System.out.println(domain.toUpperCase());
        } else {
            System.out.println("No domain found");
        }


        /********* End *********/
    }
}
