package textBook_Code._StringBuffer.append_delete_replace;

public class Delete {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        sb.append("Hello");
        sb.delete(2,4);// 删除 index 2-4 位置的字符  startindex endindex
        System.out.println(sb);
    }
}
