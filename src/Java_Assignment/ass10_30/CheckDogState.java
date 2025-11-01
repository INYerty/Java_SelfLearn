package Java_Assignment.ass10_30;

interface DogState {
    public void showState();
}
class SoftlyState implements DogState {
    //重写public void showState()
    public void showState(){
        System.out.println("在主人面前，听主人命令");
    }
}
class MeetEnemyState implements DogState {
    //重写public void showState()
    public void showState(){
        System.out.println("遇到敌人狂叫，并冲过去狠咬敌人");
    }
}
class MeetFriendState implements DogState {
     //重写public void showState()
    public void showState(){
        System.out.println("遇到朋友晃动尾巴，表示欢迎");
    }
}
class Dog {
    DogState  state;
    public void cry() {
        state.showState();
    }
    public void setState(DogState s) {
        state = s;
    }
}
public class CheckDogState {
    public static void main(String args[]) {
        Dog yellowDog =new Dog();
        yellowDog.setState(new SoftlyState());
        yellowDog.cry();
        yellowDog.setState(new MeetEnemyState());
        yellowDog.cry();
        yellowDog.setState(new MeetFriendState());
        yellowDog.cry();
    }
}
