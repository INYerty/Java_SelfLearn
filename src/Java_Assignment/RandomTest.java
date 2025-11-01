package Java_Assignment;

import java.util.Random;
import java.util.Scanner;
public class RandomTest {
    public static void main(String[] args) {
        // 定义一个字符型数组
        char[] pardStore = new char[62];
        // 把所有的大写字母放进去 把所有的小写字母放进去 把0到9放进去
        /********* Begin *********/
        int index = 0;
        for (char i = 'A'; i <= 'Z'; i++) {
            pardStore[index++] = i;
        }
        for (char i = 'a'; i <= 'z'; i++) {
            pardStore[index++] = i;
        }
        for (char i = '0'; i <= '9'; i++) {
            pardStore[index++] = i;
        }


        /********* End *********/
        // 分别以1、2、3作为种子数 生成6位随机密码
        Scanner sc = new Scanner(System.in);
        int seed = sc.nextInt();
        /********* Begin *********/
        Random rand = new Random(seed);
        for (int round = 0; round < 6; round++) {
            System.out.print(pardStore[rand.nextInt(pardStore.length)]);
        }

        /********* End *********/
    }
}
