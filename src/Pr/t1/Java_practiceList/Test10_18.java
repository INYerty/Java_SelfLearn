package Pr.t1.Java_practiceList;

public class Test10_18 {
    public static void main(String[] args) {
        int a = 10;
        String aa = String.valueOf(a);
        System.out.println(aa);
        //System.out.println((aa + 20)instanceof String);
        //true
        //Integer i1 = new Integer(100);//版本过时，不推荐使用
        Integer i1 = 100;

        int value = i1;
        int value2 = i1.intValue();
        String s1 = i1.toString();
        System.out.println(value);
        System.out.println(value2);
        System.out.println(s1);
    }
}
