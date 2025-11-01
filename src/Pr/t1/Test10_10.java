package Pr.t1;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;
public class Test10_10 {


    public static void main(String[] args) {
        /********** Begin **********/
        int[][] scores = {
                {92,85},
                {91,65},
                {90,33}
        };

        for(int i = 0;i<scores.length;i++){
            for(int j = 0;j<scores[i].length;j++){
                scores[i] = new int[]{1,2};
                System.out.println();
            }

        }




        for(int i = 0;i<scores.length;i++){
            for(int j = 0;j<scores[i].length;j++){
                System.out.print(scores[i][j]);
                System.out.println();
            }

        }








        /********** End **********/
    }

}



