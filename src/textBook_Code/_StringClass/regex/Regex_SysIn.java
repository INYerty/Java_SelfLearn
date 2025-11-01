package textBook_Code._StringClass.regex;

import java.util.Scanner;

public class Regex_SysIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if(s.matches("[a-zA-Z]+")){
            System.out.println("输入的字符串全部由字母组成");
        }else{
            System.out.println("输入的字符串不全是字母组成");
        }
        sc.close();
    }
}
