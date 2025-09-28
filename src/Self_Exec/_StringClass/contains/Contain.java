package Self_Exec._StringClass.contains;

public class Contain {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello World";

        System.out.println(s1.contains("ll")); // true
        System.out.println(s2.contains(s1)); // true
        System.out.println(s2.contains("Wor")); // true
        System.out.println(s2.contains("w")); // false, 大写小写敏感
    }
}
