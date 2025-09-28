package Self_Exec._trycatch_Running_abstract_noNameClass;
//8.5.2实验
class Goods{
    boolean isDanger;
    String name;    //
    Goods(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void SetIsDanger(boolean boo){
        isDanger = boo;
    }
    public boolean isDanger(){
        return isDanger;
    }
}
class Machine{
    public void checkBag(Goods goods)throws DangerException{
        if(goods.isDanger){
            throw new DangerException();
        }
    }
}
class DangerException extends Exception{
    public void toShow(){
        System.out.print("危险品"+" ");
    }
}
public class Check {
    public static void main(String[] args) {
        Goods apple = new Goods("苹果");
        apple.SetIsDanger(false);
        Goods explosive = new Goods("炸药");
        explosive.SetIsDanger(true);
        Machine machine = new Machine();
        //放在两个try_catch块中
        try{
            machine.checkBag(apple);
            System.out.println(apple.getName()+"检查通过");
        } catch (DangerException e) {
            e.toShow();
            System.out.println(apple.getName()+"检查不通过");
        }
        try{
            machine.checkBag(explosive);
            System.out.println(explosive.getName()+"检查通过");
        }catch(DangerException e){
            e.toShow();
            System.out.println(explosive.getName()+"检查不通过");
        }
    }
}
