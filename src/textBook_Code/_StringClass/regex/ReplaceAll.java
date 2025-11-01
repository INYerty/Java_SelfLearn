package textBook_Code._StringClass.regex;

public class ReplaceAll {
    public static void main(String[] args) {
        String str = "12hello4567";
        String regex = "[a-zA-Z]+";
        String newstr = str.replaceAll(regex, "x");
        System.out.println(newstr); // xx
    }
}