package Self_Exec._StringClass.startWith;

public class StartWith {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello World";

        System.out.println(s1.startsWith("He"));
        System.out.println(s2.startsWith(s1));
        System.out.println(s2.startsWith("W",6)); //0~6,从第六个数开始  是不是以W开头
    }
}
