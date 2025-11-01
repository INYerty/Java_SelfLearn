package Pr.t1.Java_practiceList;

import java.math.BigInteger;
import java.util.Scanner;

/*【六、数学与格式化】




17. 小数格式化输出 (DecimalFormat)
    ➤ 输出 3.1415926，保留两位小数结果为 3.14。*/
public class t6 {
    public static void main(String[] args) {
//        15. 常用数学函数 (Math)
//    ➤ 输入一个浮点数，输出：
//        - 平方根
//        - 绝对值
//        - 四舍五入后的整数。

//        Scanner sc = new Scanner(System.in);
//        double d = sc.nextDouble();
//        System.out.println(Math.sqrt(d)>=0?Math.sqrt(d):"平方根不存在");
//        System.out.println(Math.abs(d));
//        System.out.println(Math.round(d));
//        System.out.println(Math.ceil(d));
//        System.out.println(Math.floor(d));

/*| 函数          | 含义                       | 举例（输入 3.2） | 举例（输入 3.8） | 举例（输入 -3.2） | 举例（输入 -3.8） |
| --------------- | ------------------------ | ---------- | ---------- | ----------- | ----------- |
| `Math.round(x)` | **四舍五入** 到最接近的整数| 3          | 4          | -3          | -4          |
| `Math.ceil(x)`  | **向上取整**，返回不小于 `x` 的最小整数 | 4          | 4          | -3          | -3          |
| `Math.floor(x)` | **向下取整**，返回不大于 `x` 的最大整数 | 3          | 3          | -4          | -4          |
*/



//        16. 大整数乘法 (BigInteger)
//    ➤ 输入两个超出 long 范围的大整数，输出它们的乘积。
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(sc.next());
        BigInteger b = new BigInteger(sc.next());

        BigInteger result = a.multiply(b);

        System.out.println(result);

        sc.close();
    }
}


