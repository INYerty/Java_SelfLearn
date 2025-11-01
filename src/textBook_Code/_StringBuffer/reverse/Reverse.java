package textBook_Code._StringBuffer.reverse;

public class Reverse {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        sb.append("Hello");
        sb.reverse();// 反转 返回引用
        System.out.println(sb);// olleH
    }
}
