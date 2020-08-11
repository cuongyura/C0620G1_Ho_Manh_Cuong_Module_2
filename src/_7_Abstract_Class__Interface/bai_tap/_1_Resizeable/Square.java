package _7_Abstract_Class__Interface.bai_tap._1_Resizeable;

public class Square extends Shape implements Resizeable {
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
    public void resize(double percent) {
      setA(getA()+(1+percent));
    }

    @Override
    public String toString() {
        return "a = "+a;
    }
}
