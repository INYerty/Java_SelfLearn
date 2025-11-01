package textBook_Code.CalenderClass;

public class Example9_16 {
    public static void main(String[] args) {
        Example9_16_CalendarBean cb = new Example9_16_CalendarBean();
        cb.setYear(2011);
        cb.setMonth(7);
        String []a = cb.getCalendar();
        char []str = "日一二三四五六".toCharArray();
        for(char c:str){
            System.out.printf("%3c",c);
        }
        for(int i = 0;i<a.length;i++){
            if(i%7==0){
                System.out.println("");
            }
            System.out.printf("%4s",a[i]);
        }
    }
}
