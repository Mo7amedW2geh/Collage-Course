package com.company;

public class Triangle {
    private Point point1, point2, point3;
    private Line line1, line2, line3;

    public Triangle (Point point1, Point point2, Point point3){
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.line1 = new Line(point1, point2);
        this.line2 = new Line(point1, point3);
        this.line3 = new Line(point2, point3);
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
        this.line1 = new Line(point1, point2);
        this.line2 = new Line(point1, point3);
    }
    public void setPoint2(Point point2) {
        this.point2 = point2;
        this.line1 = new Line(point1, point2);
        this.line3 = new Line(point2, point3);
    }
    public void setPoint3(Point point3) {
        this.point3 = point3;
        this.line2 = new Line(point1, point3);
        this.line3 = new Line(point2, point3);
    }
    public Point getPoint1() {
        return point1;
    }
    public Point getPoint2() {
        return point2;
    }
    public Point getPoint3() {
        return point3;
    }

    public Line getLine1() {
        return line1;
    }
    public Line getLine2() {
        return line2;
    }
    public Line getLine3() {
        return line3;
    }

    public float perimeter(){
        return (getLine1().length() + getLine2().length() + getLine3().length());
    }
    public float area(){
        return (float) (Math.sqrt(0.5*perimeter() * (0.5*perimeter() - line1.length()) * (0.5*perimeter() - line2.length()) * (0.5*perimeter() - line3.length())));
    }

    @Override
    public String toString() {
        return "<" + point1 + ", " + point2 + ", " + point3 + ">";
    }
}
