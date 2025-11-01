package Pr.t1.Java_practiceList;

import textBook_Code._StringClass.subString.SubString;

import java.util.Scanner;

public class t1 {


//    /*【一、字符串基础操作】
//1. 字符串长度与截取 (length, substring)
//   ➤ 从键盘输入一个字符串，输出：
//     - 字符串长度
//     - 前 3 个字符
//     - 最后 2 个字符*/
    public static void main(String[] args) {
//        //t1
//        Scanner sc = new Scanner(System.in);
//        String text = sc.nextLine();
//        System.out.println(text.length());//长度
//        System.out.println(text.substring(0,2));//输出前两个字符
//        System.out.println(text.substring(text.length()-2,text.length()));//输出后两个字符

//        2. 字符串格式化与转换 (trim, toUpperCase, split)
//   ➤ 输入一个句子，去掉首尾空格，转换为大写，
//        再用空格分割成数组后输出每个单词。
//        //t2
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        str = str.trim();
//        str = str.toUpperCase();
//        String[] strArr = str.split("\\s+");
//        System.out.println(strArr.length);
//        for (String w:strArr) {
//            System.out.println(w);
//        }



//3. 字符串反转与拼接 (StringBuffer, reverse, append)
//   ➤ 输入两个字符串，判断它们是否相等（忽略大小写），
//     然后将它们反转并拼接输出。*/
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);//打印sb不是str
        String str2 = sc.nextLine();
        StringBuffer sb2 = new StringBuffer(str2);
        sb2.reverse();
        System.out.println(sb2);

        String str3 = sb.append(sb2).toString();
        System.out.println(str3);

    }
}
