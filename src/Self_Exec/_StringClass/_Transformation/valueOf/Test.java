package Self_Exec._StringClass._Transformation.valueOf;

public class Test {
    public static void main(String[] args) {
        byte a = 127;   //int long float double boolean char 都可转换成 String
        String aa = String.valueOf(a);
        System.out.println(aa); // 123
    }
}
