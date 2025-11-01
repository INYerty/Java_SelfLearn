package textBook_Code._StringBuffer.charAt_setcharAt;

public class CharAt {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        char ch = sb.charAt(1);
        System.out.println(ch); // e
    }
}
