package textBook_Code._StringBuffer.append_delete_replace;

public class Replace {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        sb.append("Hello");
        sb.replace(2,4,"r"); //startindex endindex str
        System.out.println(sb);
    }
}
