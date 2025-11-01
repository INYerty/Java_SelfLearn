package Pr.t1;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Scanner;

public class Task {
    /********* Begin *********/
    public static void main(String[] args) throws MyException{
        Scanner sc = new Scanner(System.in);
        String username = sc.next();

        //判断用户名
        if(username.length()<3){
            throw new MyException("用户名长度不能小于3");
        }else{
            System.out.println("用户名合法");
        }


    }
}

class MyException extends Exception{
    public MyException() {

    }
    public MyException(String msg) {
        super(msg);
    }
}

/********* End *********/