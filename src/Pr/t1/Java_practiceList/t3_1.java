package Pr.t1.Java_practiceList;

//        9. 接口与匿名类实现 (interface, noName, Running)
//   ➤ 定义接口 Running，包含方法 run()；
//        在主类中用匿名内部类实现接口，输出 “I am running!”。

public class t3_1 implements Running{
    public void run(){
        System.out.println("I am running!");
    }
    public static void main(String[] args) {
         t3_1 t= new t3_1();
         t.run();
    }
}
