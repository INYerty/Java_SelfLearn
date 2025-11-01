package textBook_Code.Scanner_regex;

import javax.xml.validation.TypeInfoProvider;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Example9_21 {
    public static void main(String[] args) {
        String cost = "市话费76.89元，长途话费：167.38元，短信费：12.68元";
        Scanner scanner = new Scanner(cost);
        scanner.useDelimiter("[^1234567890.]+");    //去掉……非数字和小数点的字符
        double sum = 0;
        while (scanner.hasNext()) {
            try{
                double price = scanner.nextDouble();
                sum += price;
                System.out.println(price);
            }catch (InputMismatchException e){
                scanner.next();
            }
        }
        System.out.println("总话费为: " + sum + " 元");
    }
}
