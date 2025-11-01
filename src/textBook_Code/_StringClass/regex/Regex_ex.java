package textBook_Code._StringClass.regex;

public class Regex_ex {
    public static void main(String[] args) {
        String regex1 = "[a-zA-Z]";
        String regex2 = "[a-z[A-Z]]";//a-z或者A-Z

        System.out.println("A".matches(regex1)); // true
        System.out.println("A".matches(regex2)); // true
        System.out.println("z".matches(regex1)); // true
        System.out.println("z".matches(regex2)); // true
    }
}
