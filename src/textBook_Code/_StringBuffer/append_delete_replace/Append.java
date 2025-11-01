package textBook_Code._StringBuffer.append_delete_replace;

public class Append {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("asdf");
        String s = "asdfasdfasdf";
        int a = 10;
        System.out.println(sb);
        sb.append(s);//append(String str) 重载
        System.out.println(sb);
        sb.append(a);//append(int i) 重载
        System.out.println(sb);
        //sb.append(Object);
    }
}
// //oldCapacity*2+2 = 16*2+2 = 34 < minimumCapacity