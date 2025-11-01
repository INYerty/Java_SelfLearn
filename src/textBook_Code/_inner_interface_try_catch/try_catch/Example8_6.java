package textBook_Code._inner_interface_try_catch.try_catch;

public class Example8_6 {
    public static void main(String[] args) {
        CarGoBoat ship = new CarGoBoat();
        ship.setMax(1000);
        int m = 600;
        try{
            ship.load(m);
            m = 400;
            ship.load(m);
            m = 367;
            ship.load(m);
            m = 555;
            ship.load(m);
            m = 1200;  //此时货船已经超重了，将抛出异常
            ship.load(m);  //跳转load执行
        }catch(DangerException e){
            e.warnmess();
            System.out.println("装载货物"+m+"吨，超重，危险！");
        }
        finally{
            System.out.println("货船将正点起航！");
        }
    }
}
