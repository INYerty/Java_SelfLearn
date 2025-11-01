package Pr.t1.Java_practiceList.tt6;

    public class interfaceTest {
        public static void main(String[] args) {
            // 实例化一Student的对象s，并调用talk()方法，打印信息
            /********* begin *********/
            Student s = new Student();
            System.out.println(s.talk());
            /********* end *********/

        }
    }

    // 声明一个Person接口，并在里面声明三个常量：name、age和occupation，并分别赋值，声明一抽象方法talk()
    interface Person {
        /********* begin *********/
        static final String NAME = "张三";
        static final int AGE = 18;
        static final String OCCUPATION = "学生";

        abstract String talk();
        /********* end *********/
    }

    // Student类继承自Person类 复写talk()方法返回姓名、年龄和职业信息
    class Student implements Person {
        /********* begin *********/
        public String talk() {
            return "学生——>姓名：" + NAME+ "，年龄：" + AGE + "，职业：" + OCCUPATION;
        }
        /********* end *********/
    }
