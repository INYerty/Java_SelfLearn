package Pr.t1.Java_practiceList;

import textBook_Code._StringClass.TV_Example9_5.TV;

import java.util.Scanner;

//【三、异常处理与接口】
public class t3 {
    public static void main(String[] args) {
//        8. 异常捕获除零错误 (try_catch)
//   ➤ 从键盘输入两个整数，计算它们的商；
//        若除数为 0，则捕获异常并输出提示信息。

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try{
            System.out.println(a/b);
        }catch(ArithmeticException e){
            System.out.println("除数不能为0");
        }
    }
}
