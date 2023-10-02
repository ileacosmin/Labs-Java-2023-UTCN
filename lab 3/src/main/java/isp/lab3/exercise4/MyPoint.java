package isp.lab3.exercise4;

import static java.lang.Math.sqrt;

public class MyPoint {
    private int x=0,y=0,z=0;

    public MyPoint() {
        this.x=0;
        this.y=0;
        this.z=0;
    }

    public MyPoint(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void setXYZ(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" +x +","+ y + "," + z + ")";
    }

    public int Distance(int x,int y, int z){
        return (int) sqrt((this.x-x)^2+(this.y-y)^2+(this.z-z)^2);
    }
    public int Distance(MyPoint another){
        return (int) sqrt((this.x- another.x)^2+(this.y- another.y)^2+(this.z- another.z)^2);
    }
    public static void main(String[] args){
        MyPoint p1= new MyPoint(0,0,0);
        MyPoint p2= new MyPoint(0,0,1);
        System.out.println(p1.Distance(p2));
    }
}
