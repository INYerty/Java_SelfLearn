package Heima;

import java.util.Scanner;

public class Ex103 {
    public static void main(String[] args) {
        // 数字到汉字的映射表
        String[] nums = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};

        Scanner sc = new Scanner(System.in);
        String input = sc.next();  // 用字符串接收整个输入

        // 遍历字符串的每个字符
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            // 判断是不是数字
            if (Character.isDigit(c)) {
                int n = c - '0'; // 字符转数字
                System.out.print(nums[n]);
            } else {
                System.out.print("（输入包含非数字字符！）");
                break;
            }
        }
        System.out.println(); // 换行
    }
}
