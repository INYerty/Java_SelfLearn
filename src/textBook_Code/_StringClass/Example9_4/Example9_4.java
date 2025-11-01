package textBook_Code._StringClass.Example9_4;

public class Example9_4 {
    public static void main(String[] args) {
        //初始化args数组
        args = new String[3];
        args[0] = "13";
        args[1] = "3.14";
        args[2] = "2.71";

        double aver = 0,sum = 0,item = 0;
        boolean computable = true;
        for(String s : args){
            try {
                item = Double.parseDouble(s);
                sum += item;
            }catch(NumberFormatException e){
                System.out.println("Invalid number: " + s);
                computable = false;
            }
        }
        if (computable){
            System.out.println("sum = " + sum);
        }
    }
}
