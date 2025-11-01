package textBook_Code._StringBuffer.charAt_setcharAt;

public class SetcharAt {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.setCharAt(1,'a');
        System.out.println(sb);// Hallo
    }
}
