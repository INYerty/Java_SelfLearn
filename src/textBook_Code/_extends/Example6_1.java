package textBook_Code._extends;

class People{
    float weight,height;
    String name;
    void speak(String s){
        System.out.println(s);
    }
}

class Student extends People{
    int number;
    double add(double a,double b){
        return a+b;
    }
}

public class Example6_1 {
    public static void main(String[] args) {
        Student zhangsan = new Student();
        zhangsan.weight = 65.6f;
        zhangsan.height = 182f;
        zhangsan.name = "张三";
        zhangsan.number = 201011;
        zhangsan.speak("我是"+zhangsan.name+"，我的学号:"+zhangsan.number);
        System.out.println("我的身高："+zhangsan.height+"cm，我的体重："+zhangsan.weight+"kg");
        System.out.println("我会做加法：");
        double sum = zhangsan.add(23.5,879.987);
        System.out.println("sum="+sum);
    }

}
