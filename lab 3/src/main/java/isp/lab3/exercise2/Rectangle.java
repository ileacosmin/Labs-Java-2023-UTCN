package isp.lab3.exercise2;

public class Rectangle {
    private int length, width;
    private String color;

    public Rectangle(){
        length=2;
        width=1;
        color="red";
    }
    public Rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }
    public Rectangle(int length,int width, String color){
        this.length=length;
        this.width=width;
        this.color=color;
    }

    public int getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }

    public int getWidth() {
        return width;
    }
    public int getPeremiter(){
        return 2*width+2*length;
    }
    public int getArea(){
        return width*length;
    }
    public static void main(String[] args){
        Rectangle R=new Rectangle();
        System.out.println(R.getLength());
        System.out.println(R.getWidth());
        System.out.println(R.getColor());
        System.out.println(R.getPeremiter());
        System.out.println(R.getArea());

    }
}
