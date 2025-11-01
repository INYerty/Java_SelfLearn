package textBook_Code.StringTokenizer;

import java.text.DecimalFormat;
import java.util.*;

public class E {
    public static void main(String[] args) {
        String s1 = "苹果56.7元，香蕉12元，柠檬：19.8元";
        String s2 = "酱油：6.7元，精盐：0.8元，榨菜：9.8元";
        ComputePrice jisuan = new ComputePrice();
        String regex = "[^0123456789.]+";
        DecimalFormat df = new DecimalFormat("0.000000");
        String s1_number = s1.replaceAll(regex,"*");
        double sum1 = jisuan.compute(s1_number,"*");

        System.out.println("水果总价为: " + df.format(sum1) + " 元");
        String s2_number = s2.replaceAll(regex,"#");
        double sum2 = jisuan.compute(s2_number,"#");
        System.out.println("调味品总价为: " + df.format(sum2) + " 元");
    }
}


class ComputePrice{
    double compute(String str,String fenge){
        StringTokenizer st = new StringTokenizer(str,fenge);
        double sum = 0;
        double digitalItem = 0;
        while (st.hasMoreTokens()){
            String s = st.nextToken();
            digitalItem = Double.parseDouble(s);
            sum += digitalItem;
        }
        return sum;
    }
}