package Pr.t1.Java_practiceList;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class t2 {
    public static void main(String[] args) {
//        4. 字符串查找 (indexOf)
//   ➤ 输入一个字符串，查找子串 "Java" 出现的位置（索引），
//        如果没有则输出“未找到”。
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        System.out.println(str.indexOf("Java"));
//        if(str.indexOf("Java")==-1){
//            System.out.println("未找到");
//        }


//        【二、字符串比较与匹配】
//        5. 字符串前缀与后缀判断 (startsWith, endsWith)
//   ➤ 判断字符串是否以 "www." 开头、是否以 ".com" 结尾。
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        System.out.println(str.startsWith("www."));
//        System.out.println(str.endsWith(".com"));


//        6. 字符串包含判断与比较 (compareTo, contains)
//   ➤ 比较两个字符串的字典序关系，并判断是否包含 "test"。
//        Scanner sc = new Scanner(System.in);
//        String str1 = sc.nextLine();
//        String str2 = sc.nextLine();
//        System.out.println(str1.compareTo(str2));
//        System.out.println(str1.contains("test"));
//        System.out.println(str2.contains("test"));


//        7. 正则表达式匹配邮箱 (Pattern, Matcher, regex)
//   ➤ 从字符串中提取所有符合邮箱格式的子串，
//        例如：abc@qq.com、test_123@163.com。
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(.com|.cn|.net)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while(matcher.find()){
            System.out.println("find!  "+matcher.group());
        }
    }
}
