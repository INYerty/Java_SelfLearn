package Java_Assignment.ShiYan3;

import java.util.Scanner;

public class Tank {
    private int speed=0;
    private int nums=0;
    static int count = 0;
    public Tank(int speed, int nums) {
        this.speed = speed;
        this.nums = nums;
        count++;
    }
    public void accelerate(int acspeed){
        this.speed += acspeed;
    }
    public void decelerate(int despeed){
        this.speed -= despeed;
    }
    public int setNums(int nums){
        this.nums = nums;
        return nums;
    }
    public int getNums(){
        return this.nums;
    }
    public static int getCount(){
        return count;
    }
    public int getSpeed(){
        return this.speed;
    }
    public void fire(){
        if(this.nums==0){
            System.out.println("炮弹数量不足，无法开火！");
        }else{
            this.nums--;
            System.out.println("已打出一发炮弹！");
        }
    }
    public static void main(String[] args) {
        Tank tank1 = new Tank(0,10);
        Tank tank2 = new Tank(1,10);
        Scanner sc = new Scanner(System.in);
        System.out.println("tank1的炮弹数量为："+tank1.getNums());
        System.out.println("tank2的炮弹数量为："+tank2.getNums());
        tank1.accelerate(80);
        System.out.println("tank1的速度为："+tank1.getSpeed());
        tank2.accelerate(90);
        System.out.println("tank2的速度为："+tank2.getSpeed());
        tank1.fire();
        tank2.fire();
        tank2.fire();
        System.out.println("tank1的炮弹数量为："+tank1.getNums());
        System.out.println("tank2的炮弹数量为："+tank2.getNums());


    }
}
