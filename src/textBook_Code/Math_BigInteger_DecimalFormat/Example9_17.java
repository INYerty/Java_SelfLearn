package textBook_Code.Math_BigInteger_DecimalFormat;

import java.math.BigInteger;

public class Example9_17 {
    public static void main(String[] args) {
        double a = 5.0;
        double st = Math.sqrt(a);
        System.out.println(a+"的平方根是"+st);
        BigInteger result = new BigInteger("0");
        BigInteger one = new BigInteger("123456789");
        BigInteger two = new BigInteger("987654321");
        result = one.add(two);
        System.out.println("和："+result);
        result = one.multiply(two);
        System.out.println("积："+result);
    }
}
