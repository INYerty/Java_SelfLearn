package textBook_Code._StringClass.StringArray;

public class Example9_7 {
    public static void main(String[] args) {
        byte[] d = "Java���".getBytes();
        System.out.println("����d�ĳ����ǣ�" + d.length);
        String s = new String(d,6,2);
        System.out.println(s);
        s = new String(d,0,6);
        System.out.println(s);
    }
}
