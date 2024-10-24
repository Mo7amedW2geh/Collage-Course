package com.company;

public class Line {
    private Point point1, point2;

    public Line(Point point1, Point point2){
        this.point1 = point1;
        this.point2 = point2;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }
    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint1(){
        return point1;
    }
    public Point getPoint2(){
        return point2;
    }

    public float length(){
        return (float) Math.sqrt(Math.pow(point1.getX() - point2.getX(), 2) + Math.pow(point1.getY() - point2.getY(), 2) + Math.pow(point1.getZ() - point2.getZ(), 2));
    }
    public Point unitVector(){
        return new Point((point2.getX() - point1.getX())/length(), (point2.getY() - point1.getY())/length(), (point2.getZ() - point1.getZ())/length());
    }

    @Override
    public String toString() {
        return "[" + point1 + ", " + point2 + "]";
    }
}
