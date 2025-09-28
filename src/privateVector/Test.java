package privateVector;

class MyDate{
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day){
        this.setDate(year,month,day);
    }

    public void setDate(int y,int m,int d){
        this.year = y;
        this.month = m;
        this.day = d;
    }
    public int getYear(){
        return this.year;
    }
    public int getMonth(){
        return this.month;
    }
    public int getDay() {
        return this.day;
    }

}
public class Test {
    public static void main(String[] args) {
        MyDate myDate = new MyDate(1,2,3);
        System.out.println(myDate.getYear()+"-"+myDate.getMonth()+"-"+myDate.getDay());

    }
}
