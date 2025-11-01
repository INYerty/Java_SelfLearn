package textBook_Code.Math_BigInteger_DecimalFormat.DecimalFormat;

import java.text.DecimalFormat;

public class Example9_18 {
    public static void main(String[] args) {
        double number = 98765.123456;
        System.out.println(number+"格式化为整数最少6位，小数最少3位：");
        DecimalFormat df2 = new DecimalFormat("000000.000");
        String result = df2.format(number);
        System.out.println(result);
        number = 12345678.987654;
        System.out.printf("%f格式化为整数最少2位，小数最多4位(整数部分按千位分组)：%n",number);
        df2 = new DecimalFormat(",#00.0000$");
        String result2 = df2.format(number);
        System.out.println(result2);

        number = 0.986796;
        System.out.println(number+"格式化为百分数和千分数：");
        df2 = new DecimalFormat("0.0000%");
        result = df2.format(number);
        System.out.println(result);
        df2 = new DecimalFormat("0.0000\u2030");
        result = df2.format(number);
        System.out.println(result);


        String money = "9,576,769.345￥";
        df2 = new DecimalFormat(",##0.000￥");
        System.out.println(money+"解析为数字：");

        try{
            Number num = df2.parse(money);
            double d = num.doubleValue();
            System.out.println(d);
        }catch(Exception e){
            System.out.println("解析错误");
        }

    }
}
