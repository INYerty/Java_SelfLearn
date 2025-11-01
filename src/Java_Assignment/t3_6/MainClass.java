package Java_Assignment.t3_6;
import java.util.Scanner;

class TotalArea extends Geometry{
    Geometry[] tuxing = new Geometry[30];
    public double getArea(){
        return 0;
    }
}
abstract class Geometry{
    public double computerTotalArea(Geometry[] tuxing){
        double totalArea = 0;
        for(int i=0;i<30;i++){
            if(tuxing[i]!=null){
                totalArea+=tuxing[i].getArea();
            }
        }
        return totalArea;
    }
    public abstract double getArea();
}
class Circle extends Geometry{
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }

}
class Rectangle extends Geometry{
    private double height;
    private double width;
    public Rectangle(double height,double width){
        this.height=height;
        this.width=width;
    }
    public double getArea() {
        return height * width;
    }
}

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TotalArea totalArea = new TotalArea();
        for(int i=0;i<30;i++){
            System.out.println("请输入第"+(i+1)+"个图形的类型(1.圆形 2.矩形 3.结束):");
            int type = sc.nextInt();
            if(type==1){
                System.out.println("请输入圆的半径:");
                double radius = sc.nextDouble();
                totalArea.tuxing[i] = new Circle(radius);
            }else if(type==2){
                System.out.println("请输入矩形的长和宽:");
                double height = sc.nextDouble();
                double width = sc.nextDouble();
                totalArea.tuxing[i] = new Rectangle(height,width);
            }else if(type==3){
                System.out.println("总面积为:"+totalArea.computerTotalArea(totalArea.tuxing));
                break;
            }
        }
    }
}
