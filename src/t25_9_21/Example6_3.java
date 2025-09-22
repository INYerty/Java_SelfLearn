package t25_9_21;

class A{
    float computer(float x,float y){                //被重写的方法
        return x+y;
    }
    public int g(int x,int y){         //被继承的方法
        return x+y;
    }
}

class B extends A{
    float computer(float x,float y){       //重写方法
        return x*y;
    }
}




public class Example6_3 {
    public static void main(String[] args) {
        B b = new B();
        double result = b.computer(8,9);
        System.out.println("调用重写方法得到的result="+result);
        int m = b.g(12,8);
        System.out.println("调用继承方法得到的result="+m);
    }
}
