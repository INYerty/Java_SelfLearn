package textBook_Code.chapter9Exam;

class MyString {
        public String getString(String s){
            StringBuffer str = new StringBuffer();
            for(int i = 0;i< s.length();i++){
                if(i%2 == 0){//注意是下标 不是真值
                    char c = s.charAt(i);
                    str.append(c);
                }
            }
            return new String(str);
        }
}

public class T4 {
    public static void main(String[] args) {
        String s = "1234567890";
        MyString ms = new MyString();
        System.out.println(ms.getString(s));
    }
}
