package Java_Assignment.ShiYan3;

public class Vehicle {
    private double speed=0;//速度
    private int power=0;//功率

    public Vehicle() {
        this.speed=speed;
        this.power=power;
    }

    public Vehicle(double speed, int power) {
        this();
    }

    void speedUp(int s){
        this.speed+=s;
    }
    void speedDown(int d){
        this.speed-=d;
    }
    void setPower(int p){
        power=p;
    }
    int getPower(){
        return power;
    }
    double getSpeed(){
        return speed;
    }
}
