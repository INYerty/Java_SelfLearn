package textBook_Code._StringBuffer.insert;

public class Insert {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello World");
        sb.insert(5,"你好");//index 5 位置插入 "你好"
        System.out.println(sb);
    }
}
