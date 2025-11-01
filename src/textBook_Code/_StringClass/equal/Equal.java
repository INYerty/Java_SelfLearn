package textBook_Code._StringClass.equal;

public class Equal {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1 == s2); // 比较的是引用地址，false
        System.out.println(s1.equals(s2)); // true, same content

        String s3 = "hello";
        String s4 = "hello";
        System.out.println(s3 == s4); // 比较的是引用地址，true, string pool
        System.out.println(s3.equals(s4)); // true, same content

        String s5 = s1;
        System.out.println(s1 == s5); // 比较的是引用地址，true
        System.out.println(s1.equals(s5)); // true, same content
    }
}
