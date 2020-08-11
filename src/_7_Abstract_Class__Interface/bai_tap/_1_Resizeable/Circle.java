package _7_Abstract_Class__Interface.bai_tap._1_Resizeable;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;
    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void resize(double percent) {
      setRadius(getRadius()*(1+percent));
    }

    @Override
    public String toString() {
        return "radius: "+radius;
    }
}
