package textBook_Code.Math_BigInteger_DecimalFormat;

import java.lang.Math;

public class Math1 {
    public static void main(String[] args) {
        double a = 5.7;
        double b = 2.3;
        System.out.println("Max: " + Math.max(a, b));
        System.out.println("Min: " + Math.min(a, b));
        System.out.println("Square root of " + a + ": " + Math.sqrt(a));
        System.out.println("Absolute value of -a: " + Math.abs(-a));//绝对值
        System.out.println("a raised to the power of b: " + Math.pow(a, b));//a的b次方
        System.out.println("Random number between 0 and 1: " + Math.random());//随机数
        System.out.println(Math.log(10)); //自然对数
        System.out.println(Math.sin(Math.PI / 2)); //正弦
        System.out.println(Math.asin(1)); //反正弦
    }
}
