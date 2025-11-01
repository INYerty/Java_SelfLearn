package Java_Assignment.ch3_5;

class People {
    protected double height;
    protected double weight;

    public void speakHello(){
        System.out.println("你好");
    }
    public void averageHeight(){
        System.out.println("平均身高: 170cm");
    }
    public void averageWeight(){
        System.out.println("平均体重: 65kg");
    }
}
class ChinaPeople extends People{
    public void chinaGongfu(){
        System.out.println("坐如钟、站如松、睡如弓");
    }
    public void speakHello(){
        System.out.println("你好,我是中国人");
    }
    public void averageHeight(){
        System.out.println("平均身高: 180cm");
    }
    public void averageWeight(){
        System.out.println("平均体重: 70kg");
    }
}

class AmericanPeople extends People{
    public void americanBoxing(){
        System.out.println("直拳、勾拳、组合拳");
    }
    public void speakHello(){
        System.out.println("Hello, I am American" );
    }
    public void averageHeight(){
        System.out.println("平均身高: 175cm");
    }
    public void averageWeight(){
        System.out.println("平均体重: 75kg");
    }
}

class BeijingPeople extends ChinaPeople{
    public void BeijingOpera(){
        System.out.println("花脸、青衣");
    }
    public void speakHello(){
        System.out.println("你好,我是北京人");
    }
    public void averageHeight(){
        System.out.println("平均身高: 178cm");
    }
    public void averageWeight(){
        System.out.println("平均体重: 72kg");
    }
}

public class MainClass {
    public static void main(String[] args) {
        People cp = new ChinaPeople();
        cp.speakHello();
        cp.averageHeight();
        cp.averageWeight();
        ((ChinaPeople) cp).chinaGongfu();

        People ap = new AmericanPeople();
        ap.speakHello();
        ap.averageHeight();
        ap.averageWeight();
        ((AmericanPeople) ap).americanBoxing();

        People bp = new BeijingPeople();
        bp.speakHello();
        bp.averageHeight();
        bp.averageWeight();
        ((BeijingPeople) bp).BeijingOpera();
    }
}
