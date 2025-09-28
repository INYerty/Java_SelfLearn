package Self_Exec._trycatch_Running_abstract_noNameClass;

class Cry{
    public void cry(){
        System.out.println("大家好！");
    }
}

public class E {
    public static void main(String[] args) {
        Cry hello = new Cry(){
            public void cry(){              //匿名子类重写cry方法
                System.out.println("大家好，祝工作顺利！");
            }
        };
        hello.cry();

    }
}
