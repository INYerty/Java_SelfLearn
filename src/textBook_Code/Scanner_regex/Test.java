package textBook_Code.Scanner_regex;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        String NBA = "I Love This Game";
        Scanner scanner = new Scanner(NBA);
        while (scanner.hasNext()){
            System.out.println(scanner.next());//默认以空格为分隔符
        }
        try {
            //String num = "168.98 99.5 100.0";
            String num = "168.98 99.5 100.0###"; //测试异常
            Scanner scanner1 = new Scanner(num);
            while (scanner1.hasNext()){
                double i = scanner1.nextDouble();
                System.out.println(i);
            }
        } catch (InputMismatchException e) {
            System.out.println("输入的内容不是Double类型");
            System.out.println(scanner.next());
        }
    }
}
