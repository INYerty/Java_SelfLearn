package textBook_Code._StringBuffer;

public class Example9_12 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        str.append("大家好");
        System.out.println("str:"+str);
        System.out.println("length:"+str.length());
        System.out.println("capacity:"+str.capacity());// 默认16
        str.setCharAt(0,'w');
        str.setCharAt(1,'e');
        System.out.println(str);
        str.insert(2," are all");
        System.out.println(str);
        int index = str.indexOf("好");//查找好的下标
        str.replace(index,str.length()," right");
        System.out.println(str);
    }
}
// str:大家好
// length:3
// capacity:16
// we好
// we are all好
// we are all right
