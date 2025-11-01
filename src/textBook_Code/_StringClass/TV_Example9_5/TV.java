package textBook_Code._StringClass.TV_Example9_5;

public class TV {
    String name;
    public TV(){};
    public TV(String s){
        name = s;
    }
    public String toString(){
        String oldStr = super.toString();
        return oldStr + "\n这是电视机，品牌是" + name;
    }
}
