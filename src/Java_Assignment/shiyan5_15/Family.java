package Java_Assignment.shiyan5_15;

public class Family {
    TV homeTV;
    void buyTV(TV tv) {
        this.homeTV = tv;       //将参数tv赋值给homeTV
    }
    void remoteControl(int m) {
        homeTV.setChannel(m);
    }
    void seeTV() {
        homeTV.showProgram();  //homeTV调用showProgram()方法
    }
}
