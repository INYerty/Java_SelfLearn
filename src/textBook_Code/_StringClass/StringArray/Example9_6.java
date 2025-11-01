package textBook_Code._StringClass.StringArray;

public class Example9_6 {
    public static void main(String[] args) {
        char [] a,b,c ;
        String s = "2009年10月1日是中华人民共和国成立60周年";
        a = new char[2];
        s.getChars(11,13,a,0);
        System.out.println(a);
        c = "十一长假期间，学校都放假了".toCharArray();
        for(char ch : c){
            System.out.print(ch);   //每次从数组 c 中依次取出一个字符，赋给变量 ch。然后执行循环体 → 打印这个字符。
        }
    }
}
