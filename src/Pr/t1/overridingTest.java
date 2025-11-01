package Pr.t1;

public class overridingTest {
    public static void main(String[] args) {
        // 实例化子类对象s，调用talk()方法打印信息
        /********* begin *********/
        Student s  = new Student("张三",18,"哈佛大学");
        System.out.println(s.talk());
        /********* end *********/

    }
}

class Person {
    /********* begin *********/
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String talk(){
        return "我是：" + name + "，今年：" + age + "岁";
    }
    /********* end *********/
}

class Student extends Person {
    /********* begin *********/
    private String school;

    public String getSchool(){
        return school;
    }

    public Student(String s,int sage,String school){
        super(s,sage);
        this.school = school;
    }
    public String talk(){
        return super.talk()+"，我在：" + school + "上学";
    }
    /********* end *********/
}