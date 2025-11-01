package Pr.t1.Java_practiceList;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*【四、日期与日历类】
11. 显示当前日期 (CalenderClass)
    ➤ 使用 Calendar 获取当前日期，
      输出格式：2025年10月12日 星期日。
*/
public class t4 {
    public static void main(String[] args) {
//        Calendar cal = Calendar.getInstance();
//        System.out.println(cal.get(Calendar.YEAR)+"年"+
//                (cal.get(Calendar.MONTH)+1)+"月"+
//                cal.get(Calendar.DAY_OF_MONTH)+"日 "+
//                "星期"+((cal.get(Calendar.DAY_OF_WEEK)-1)==0?"日":
//                (cal.get(Calendar.DAY_OF_WEEK)-1)==1?"一":
//                (cal.get(Calendar.DAY_OF_WEEK)-1)==2?"二":
//                (cal.get(Calendar.DAY_OF_WEEK)-1)==3?"三":
//                (cal.get(Calendar.DAY_OF_WEEK)-1)==4?"四":
//                (cal.get(Calendar.DAY_OF_WEEK)-1)==5?"五":"六")
//        );;



//        12. 计算两个日期间隔 (mDateClass, chapter9Exam)
//    ➤ 输入两个日期（如 2025-10-01 与 2025-10-12），
//        输出它们相差的天数。

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个日期（格式：yyyy-MM-dd）：");
        LocalDate today = LocalDate.parse(sc.nextLine());
        System.out.println("请输入第二个日期（格式：yyyy-MM-dd）：");
        LocalDate date = LocalDate.parse(sc.nextLine());

        // 使用 ChronoUnit.DAYS 计算天数差
        long days = ChronoUnit.DAYS.between(today,date);

        System.out.println("两个日期相差 " + Math.abs(days) + " 天");

        sc.close();


    }
}
