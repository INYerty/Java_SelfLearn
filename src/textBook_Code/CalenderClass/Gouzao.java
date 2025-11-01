package textBook_Code.CalenderClass;

import java.util.*;

public class Gouzao {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2005,4,17);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH)+1;//月份从0开始 0是1月
        int week = calendar.get(Calendar.DAY_OF_WEEK)-1;//星期日为第一天
        System.out.printf("year:%d,month:%d,day:%d,week:%d",year,month,day,week);
    }
}
