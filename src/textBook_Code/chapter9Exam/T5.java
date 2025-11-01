package textBook_Code.chapter9Exam;

public class T5 {
    public static void main(String[] args) {
        String regex = "\\djava\\w{1,}";
        String str1 = "88javaookk";
        String str2 = "9javaHello";

        if(str1.matches(regex)){
            System.out.println(str1);
        }
        if(str2.matches(regex)){
            System.out.println(str2);
        }
    }
}
