package _7_Abstract_Class__Interface.bai_tap._2_Colorable;

public class Square extends Shape implements Colorable {
    private double a = 0;
    public Square(){

    }
    public Square(double a) {
        this.a = a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }



    @Override
    public String toString() {
        return "a = "+a;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
