package _7_Abstract_Class__Interface.bai_tap._1_Resizeable;

public class Rectangle extends Shape implements Resizeable {
    private double a = 1.0;
    private double b = 1.0;
    public Rectangle(){

    }
    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    public void resize(double percent) {
     setA(getA()+(1+percent));
     setB(getB()+(1+percent));
    }

    @Override
    public String toString() {
        return "a = "+a+"\nb = "+b;
    }
}
