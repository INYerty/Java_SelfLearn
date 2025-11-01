package textBook_Code._StringClass.indexOf;

public class IndexOf {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(str.indexOf("b"));
        System.out.println(str.indexOf("d"));
        String str2 = "Hello World";
        String str3 = "W";
        System.out.println(str2.indexOf(str3,7));  //从str2找str3，从索引7开始找
    }
}
