package Pr.t1;
import java.util.Scanner;

public class Test{
    public int sort(int[] nums){
        int max = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i+1]-nums[i]>max){
                max = nums[i+1]-nums[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String regex = "[\\[\\]]";
        String str2 = str.replaceAll(regex, "");
        String part[] = str2.split(",");

        int nums[] = new int[part.length];
        for(int i=0;i<part.length;i++){
            nums[i] = Integer.parseInt(part[i]);
        }

        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        Test t = new Test();
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }

        System.out.println(t.sort(nums));
        sc.close();
    }
}