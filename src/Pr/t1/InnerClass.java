package Pr.t1;

class InnerClass {
    class Dog{
        public void say(){
            System.out.println("wangwang");
        }
    }

    public static void main(String[] args) {
        InnerClass is = new InnerClass();
        InnerClass.Dog isg = is.new Dog();
        isg.say();
    }
}
