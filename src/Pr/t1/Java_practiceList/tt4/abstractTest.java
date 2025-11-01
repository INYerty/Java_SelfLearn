package Pr.t1.Java_practiceList.tt4;

public class abstractTest {
    public static void main(String[] args) {
        /********* begin *********/
        // 分别实例化Student类与Worker类的对象，并调用各自构造方法初始化类属性。
        Student stu = new Student("张三",18,"学生");
        Worker wor = new Worker("李四",30,"工人");
        // 分别调用各自类中被复写的talk()方法 打印信息。
        System.out.println(stu.talk());
        System.out.println(wor.talk());
        /********* end *********/

    }
}

// 声明一个名为Person的抽象类，在Person中声明了三个属性name age occupation和一个抽象方法——talk()。
abstract class Person {
    /********* begin *********/
    private String name,occupation;
    private int age;
    public Person(String name,int age,String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getoccp(){
        return occupation;
    }

    abstract String talk();

    /********* end *********/
}

// Student类继承自Person类，添加带三个参数的构造方法，复写talk()方法 返回姓名、年龄和职业信息
class Student extends Person {
    /********* begin *********/
    public Student(String name,int age,String occupation){
        super(name,age,occupation);
    }


    public String talk(){
        return "学生——>姓名："+getName()+"，年龄："+getAge()+"，职业："+getoccp()+"！";
    }

    /********* end *********/
}

// Worker类继承自Person类，添加带三个参数的构造方法，复写talk()方法 返回姓名、年龄和职业信息
class Worker extends Person {
    /********* begin *********/
    public Worker(String name,int age,String occupation){
        super(name,age,occupation);
    }
    public String talk(){
        return "工人——>姓名："+getName()+"，年龄："+getAge()+"，职业："+getoccp()+"！";
    }
    /********* end *********/

}