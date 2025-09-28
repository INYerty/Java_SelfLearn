package Java_Assignment;

import java.util.Scanner;

public class Electricity{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int electric = scan.nextInt();
        if(electric>1&&electric<=90){
            System.out.println("您的电费为："+electric*0.6+"元");
        }else if(electric>91&&electric<=150){
            System.out.println("您的电费为："+electric*1.1+"元");
        }else if(electric>150){
            System.out.println("您的电费为："+electric*1.7+"元");
        }
    }
}