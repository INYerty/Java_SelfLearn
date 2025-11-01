package textBook_Code._inner_interface_try_catch.try_catch;

public class DangerException extends Exception {  //抛出异常至此
    final String message = "超重";    //定义了常量Message
    public void warnmess(){
        System.out.println(message);    //打印出Message
    }
}
