package Java_Assignment.ShiYan3.tom2.jierui2;

import Java_Assignment.ShiYan3.tom1.jierui1.Student; //导包

import java.util.Scanner;
/*（2）tom2.jierui2包中：
	编写一个主类
	在主类中，通过Student创建一个数组，有两个数组元素：
分别为“张一”、20岁；“王二”、19岁；
	通过命令行输入学生的年龄，来查看该年龄都有哪些同学。*/
public class MainClass {
    public static void main(String[] args) {
        Student[] students=new Student[2];
        students[0]=new Student("张一",20);
        students[1]=new Student("王二",19);
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入学生年龄：");
        int age = sc.nextInt();
        boolean found=false;
        for(int i=0;i<students.length;i++){
            if(students[i].getAge()==age){
                System.out.println("年龄为"+age+"岁的学生有："+students[i].getName());
                found=true;
            }
        }
        if(found==false){
            System.out.println("没有找到年龄为"+age+"岁的学生");
        }
    }
}
