package Self_Exec._extends.Example_64;

public class Bank {
    int saveMoney;
    int year;
    double interest;
    public double computerInterest(){
        interest = year * 0.035 * saveMoney;
        System.out.printf("%d 元在银行%d 年利息：%f元\n",saveMoney,year,interest);
        return interest;
    }
}
