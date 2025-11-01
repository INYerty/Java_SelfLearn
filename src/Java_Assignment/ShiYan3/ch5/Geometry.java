package Java_Assignment.ShiYan3.ch5;
public class Geometry {
    Rectangle rect;
    Circle circle;
    Geometry(Rectangle rect,Circle circle){
        this.rect=rect;
        this.circle=circle;}
    public void setCirclePosition(double x,double y){
        circle.setX(x);
        circle.setY(y);}
    public void setCircleRadius(double radius){
        circle.setRadius(radius);}
    public void setRectanglePosition(double x,double y){
        rect.setX(x);
        rect.setY(y);}
    public void setRectangleSize(double width,double height){
        rect.setWidth(width);
        rect.setHeight(height);}
    public void showLink(){
        double circleX=circle.getX();
        double rectX=rect.getX();
        double rectLeft = rect.getX();
        double rectRight = rect.getX() + rect.getWidth();
        double circleLeft = circle.getX() - circle.getRadius();
        double circleRight = circle.getX() + circle.getRadius();
        if (rectLeft > circleRight) {
            System.out.println("矩形在圆的右侧。");}
        else if (rectRight < circleLeft) {
            System.out.println("矩形在圆的左侧。");
        }else{
            System.out.println("矩形与圆相交。");
        }}}
