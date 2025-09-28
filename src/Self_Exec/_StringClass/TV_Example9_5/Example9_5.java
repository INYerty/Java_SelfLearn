package Self_Exec._StringClass.TV_Example9_5;

import java.util.Date;

public class Example9_5 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());
        TV tv = new TV("海尔");
        System.out.println(tv.toString());
    }
}
