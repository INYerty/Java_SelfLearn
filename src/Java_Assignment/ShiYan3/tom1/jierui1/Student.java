package Java_Assignment.ShiYan3.tom1.jierui1;
/*（1）tom1.jierui1包中：
	编写一个Student类，具有私有变量：年龄和姓名；
	重载构造方法，使得初始化的时候可以直接定义年龄和姓名，
或者，只定义学生的姓名（此时，设置默认年龄为：20岁）；
	编写方法，可以分别更改年龄和姓名，同时也可以分别读出年龄和姓名；
*/
public class Student {
    private  String name;
    private int age;

    public Student(String name){
        this.name=name;
        this.age=20;
    }
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String newName){
        this.name = newName;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
