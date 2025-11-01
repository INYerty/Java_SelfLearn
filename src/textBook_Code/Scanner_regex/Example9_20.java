package textBook_Code.Scanner_regex;

import java.util.Scanner;

//Think1

public class Example9_20 {
    public static void main(String[] args) {
        String cost = "TV cost 876 dollar.Computer cost 2398 dollar.Telephone cost 1278 dollar";
        Scanner scanner = new Scanner(cost);
        double sum = 0;
        while (scanner.hasNext()) {
            if(scanner.hasNextDouble()) {
                sum += scanner.nextDouble();
                System.out.println(sum);
            }else{
                scanner.next();
            }

        }
        /*while (scanner.hasNext()) {
            System.out.println(scanner.nextDouble());
        }//导致死循环  会卡在第一个TV 因为没有Double类型
        */

        System.out.println("总价为: " + sum + " dollar");

    }
}


/*
//教材源码
import java.util.*;
public class Example9_20 {
   public static void main(String args[]) {
      String  cost= "TV cost 876 dollar.Computer cost 2398 dollar.telephone cost 1278 dollar.";
      Scanner scanner = new Scanner(cost);
      double sum=0;
      while(scanner.hasNext()){
         try{
              double price=scanner.nextDouble();
              sum=sum+price;
              System.out.println(price);
         }
         catch(InputMismatchException exp){
              String t=scanner.next();
         }
      }
      System.out.println("总消费:"+sum+"元");
   }
}
*/