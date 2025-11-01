package textBook_Code.DateClass;

import java.text.SimpleDateFormat;
import java.util.*;


public class Example9_14 {
    public static void main(String[] args) {
//        Date nowTime = new Date();
//        System.out.println("当前时间是：" + nowTime);
//        String pattern = "yyyy-MM-dd";
//        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
//        String timePattern = sdf.format(nowTime);
//        System.out.println("格式化后的时间是：" + timePattern);
//        sdf = new SimpleDateFormat("G yyyy年MM月dd日HH时mm分ss秒z");//新模式
//        timePattern= sdf.format(nowTime);//转换现在时间
//        System.out.println(timePattern);
        Date date = new Date();
        System.out.println("现在时间是："+date);
        //格式化
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String newTimePattern = sdf.format(date);
        System.out.println("格式化后的时间是:"+newTimePattern);

        //格式化2
        String pattern2 = "G yyyy 'year' MM 'month' dd 'day' HH 'hour' mm 'minute' ss 'second' z";
        sdf = new SimpleDateFormat(pattern2);
        String newTimePattern2 = sdf.format(date);
        System.out.println("格式化后的时间是:"+newTimePattern2);
    }
}
