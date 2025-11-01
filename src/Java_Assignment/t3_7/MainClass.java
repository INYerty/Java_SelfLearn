package Java_Assignment.t3_7;

class Display{
    Gaozhi gaozhi;
    public void show(Gaozhi gaozhi){
        gaozhi.xuanchuan();
    }
}

abstract class Gaozhi{
    abstract void xuanchuan();
}

class Suning extends Gaozhi{
    public void xuanchuan(){
        System.out.println("苏宁易购，购物上苏宁");
    }
}

class Huawei extends  Gaozhi{
    public void xuanchuan(){
        System.out.println("华为手机，世界领先");
    }
}

public class MainClass {
    public static void main(String[] args) {
        Gaozhi gaozhisunig = new Suning();
        Gaozhi gaozhihuawei = new Huawei();
        Display d = new Display();
        d.show(gaozhisunig);
        d.show(gaozhihuawei);
    }
}
