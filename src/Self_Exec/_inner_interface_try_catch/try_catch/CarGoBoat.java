package Self_Exec._inner_interface_try_catch.try_catch;

public class CarGoBoat {
    int realcontent;
    int maxcontent;
    public void setMax(int c){
        maxcontent = c;
    }
    public void load(int m) throws DangerException{  //当m = 2000的时候，抛出异常至此
        realcontent = m;
        if (realcontent > maxcontent){ //我们设置的maxcontent = 1000<2000 判断出异常
            throw new DangerException();    //将会抛出异常给DangerException
        }
        System.out.println("装载了"+m+"吨货物");
    }
}
