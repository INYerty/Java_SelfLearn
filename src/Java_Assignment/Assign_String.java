package Java_Assignment;

import textBook_Code._StringClass.indexOf.LastIndexOf;

import java.util.Scanner;

public class Assign_String {
    public static StringBuffer start(String data) {
        StringBuffer ans = new StringBuffer();
        /********** Begin *********/
        String s[] = data.split(" ");

        for(int i=0;i<s.length;i++){
            StringBuffer sb = new StringBuffer(s[i]);
            ans.append(sb.reverse() +" ");
        }

        /********** End *********/
        return ans;
    }

}
