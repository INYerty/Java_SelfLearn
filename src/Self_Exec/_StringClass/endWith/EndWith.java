package Self_Exec._StringClass.endWith;

public class EndWith {
    public static void main(String[] args) {
        String s1 = new String("W");
        String s2 = new String("Hello World");
        System.out.println(s2.endsWith(s1));
        System.out.println(s2.endsWith("d"));
        //System.out.println(s2.endsWith("o",7));  //×不能这么写！endsWith() 方法只有一个参数版本：endsWith(String suffix)
    }
}
