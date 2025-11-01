package textBook_Code.Math_BigInteger_DecimalFormat.DecimalFormat;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Test {
    public static void main(String[] args) throws ParseException {
        double a = 3.1415926535897932384626;
        double b = 1232.718281828459045235360287;
        long c = 12345678912345L;
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println(df.format(a));
        df = new DecimalFormat("00000.00000");
        System.out.println(df.format(b));
        df = new DecimalFormat("###,##,##0.00%");//‰ /u2030
        System.out.println(df.format(c));
        df = new DecimalFormat("###,##,##0.00E0");
        System.out.println(df.format(c));
        df = new DecimalFormat("###,##,##0.00$");
        System.out.println(df.format(c));
        df = new DecimalFormat("##,##,##0.00￥");
        System.out.println(df.format(c));
        df = new DecimalFormat(",##0.00");
        System.out.println(df.format(c));

        System.out.println("-------------------");
        DecimalFormat df2 = new DecimalFormat("###,##0.00rmb");
        Number number = df2.parse("123,4,568.12rmb");
        double d = number.doubleValue();
        System.out.println(d);

    }
}
