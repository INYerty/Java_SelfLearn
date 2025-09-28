package Java_Assignment;

public class E {
    public static void main(String[] args) {
        byte d[] = "abc我们喜欢打篮球".getBytes();
        System.out.println(d.length);
        String s = new String(d,0,7);
        System.out.println(s);

    }
}
