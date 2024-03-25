package com.company;

import java.text.DecimalFormat;
public class Point {
    private float x, y, z;

    public Point(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setX(float x) {
        this.x = x;
    }
    public void setY(float y) {
        this.y = y;
    }
    public void setZ(float z) {
        this.z = z;
    }

    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    public float getZ() {
        return z;
    }

    public float distance(){
        return (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    public Point add(Point another){
        return new Point(this.x + another.getX(), this.y + another.getY(), this.z + another.getZ());
    }
    public Point sub(Point another){
        return new Point(this.x - another.getX(), this.y - another.getY(), this.z - another.getZ());
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat();
        return "{" + df.format(x) + ", " + df.format(y) + ", " + df.format(z) + '}';
    }
}
