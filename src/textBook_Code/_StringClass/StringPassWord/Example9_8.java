package textBook_Code._StringClass.StringPassWord;

import java.util.Scanner;

public class Example9_8 {
    public static void main(String[] args) {
        String sourceString = "今晚十点进攻";
        EncryptAndDecrypt person = new EncryptAndDecrypt();
        System.out.println("输入密码加密："+sourceString);
        Scanner sc = new Scanner(System.in);
        String passWord = sc.nextLine();
        String secret = person.encrypt(sourceString, passWord);
        System.out.println("密文："+secret);
        System.out.println("输入密码解密：");
        passWord = sc.nextLine();
        String source = person.decrypt(secret, passWord);
        System.out.println("明文："+source);
    }
}
