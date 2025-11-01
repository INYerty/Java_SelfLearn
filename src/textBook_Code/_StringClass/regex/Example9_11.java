package textBook_Code._StringClass.regex;

import java.util.Scanner;

public class Example9_11 {
    public static void main(String[] args) {
        System.out.println("一行文本：");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //空格、数字和标点符号
        String regex = "[\\s\\p{Punct}\\d]+";
        String word[] = str.split(regex);
        for (int i = 0; i < word.length; i++) {
            int m = i + 1;
            System.out.println("单词"+m+"："+word[i]);
        }
    }
}
