package Self_Exec._StringClass.CompareTo;

public class Compare {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("abc");
        String s3 = new String("abd");
        String s4 = new String("ab");

        System.out.println(s1.compareTo(s2)); // 0, same content
        System.out.println(s1.compareTo(s3)); // <0, s1 is less than s3
        System.out.println(s1.compareTo(s4)); // >0, s1 is greater than s4
    }
}
//大于的时候输出大于0的数
//小于的时候输出小于0的数
//等于的时候输出0
//按照字典顺序比较
//比较到不同的字符就停止比较
//比较到最后一个字符还没有不同的字符就停止比较