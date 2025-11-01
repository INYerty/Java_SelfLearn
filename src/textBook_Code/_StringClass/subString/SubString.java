package textBook_Code._StringClass.subString;

public class SubString {
    public static void main(String[] args) {
        String str1 = "abcde";
        System.out.println(str1.substring(1));
        System.out.println(str1.substring(0,2)); //左闭右开 [0,2) 取左不取右
    }
}
