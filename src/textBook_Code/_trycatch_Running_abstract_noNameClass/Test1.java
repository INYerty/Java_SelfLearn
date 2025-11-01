package textBook_Code._trycatch_Running_abstract_noNameClass;

abstract class A{
    public abstract void run();
    public abstract void run2();
}

public class Test1 extends A{
    public void run(){
        System.out.println("实体类继承抽象类，一定要实现抽象类中的所有抽象方法。");
    }
    public void run2(){
        System.out.println("类“Test1\"必须声明为抽象，或实现'A' 中的 abstract 方法'run20)");
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.run();
        test1.run2();
    }
}
