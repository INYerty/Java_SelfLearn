package textBook_Code.CalenderClass;

import java.util.*;

public class Example9_15 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        String 年 =String.valueOf(calendar.get(Calendar.YEAR));
        String 月 =String.valueOf(calendar.get(Calendar.MONTH)+1);
        String 日 =String.valueOf(calendar.get(Calendar.DAY_OF_MONTH));
        String 星期 =String.valueOf(calendar.get(Calendar.DAY_OF_WEEK)-1);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        System.out.print("现在的时间是：");
        System.out.print(""+年+"年"+月+"月"+日+"日 星期"+星期);
        System.out.println(" "+hour+"时"+minute+"分"+second+"秒");
        int year = 1949,month = 10,day = 1;
        calendar.set(year,month-1,day);
        long time1 = calendar.getTimeInMillis();
        year = 2009;
        month = 10;
        day = 1;
        calendar.set(year,month-1,day);
        long time2 = calendar.getTimeInMillis();
        long 相隔天数 = (time2-time1)/(1000*60*60*24);
        System.out.println(calendar.getTime());
        System.out.println("从1949年10月1日到2009年10月1日相隔了"+相隔天数+"天");
    }
}
