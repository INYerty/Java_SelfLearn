package Pr.t1.Java_practiceList;

//        10. 抽象类与多态 (abstract, TV Example9_5)
//    ➤ 定义抽象类 TV，有抽象方法 play()；
//        子类 ColorTV 实现 play() 输出 “彩色电视正在播放”，
//        主方法中通过抽象类引用调用。
abstract class TV{
    public abstract void play();
}

public class t3_2 extends TV{
    public void play(){
        System.out.println("彩色电视正在播放");
    }
    public static void main(String[] args) {
        t3_2 t = new t3_2();
        t.play();
    }
}
