package _6_Ke_Thua.thuc_Hanh;

import java.sql.SQLOutput;

public class Shape {
    // Thuộc tính:
      private String color ="green";
      private boolean filled = true;

    // Hàm khởi tạo:

      public Shape(){

      }

    // Hàm khởi tạo có đối số:

    public Shape(String color, boolean filled){
      this.color = color;
      this.filled = filled;
    }

    // Tạo phương thức get, set:


    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public String toString(){
          return "A shape with color of "
                 + getColor()
                 +" and "
                 + (isFilled() ? "filled" : "filled");
    }
}

// Lớp Cicle:
  class Circle extends Shape{
    // Thuộc tính:
    private double radius = 1.0;
    // Khởi tạo mặc đinh:
    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }
    // Khởi tạo có đối số:
    public Circle(double radius, String color , boolean filled){
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    public String toString(){
        return "A Circle width radius = "
               + getRadius()
               + ", which is a subclss of"
               + super.toString();
    }
}
// class : Rectangle
  class Rectangle extends Shape{
    // Thuộc tính:
        private double width = 1.0;
        private double length = 1.0;
    // Hàm khởi tạo:
    public Rectangle(){

    }

    // Hàm khởi tạo có đối số:
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    // get , set:


    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }
    public double getArea(){
        return width* this.length;
    }
    public double getPerimeter(){
        return 2 * (width + this.length);
    }
    public String toString(){
        return "A Rectangle width width= "
               +getWidth()
               +"and length = "
               +getLength()
               +", which is a subclass of"
               +super.toString();
    }
}
//Lớp : Square
class Square extends Rectangle{
    // Thuộc tính
    private double side;
    public Square(){

    }
    public Square(double side){
        super(side,side);

    }
    public Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }

    public void setSide(double side) {
        this.side = side;
        setLength(side);
    }

    public double getSide() {
        return side;
    }
    public void setWidth(double width){
        setSide(width);
    }
    public void setLength(double length){
        setSide(length);
    }
    public String toString(){
        return "A square width side = "
                +getSide()
                +", which is a subclass of "
                +super.toString();
    }
}
// class : Main
class MainCTr{
    public static void main(String[] args) {
         // Shape:
         Shape shape = new Shape();
         System.out.println(shape);

         shape = new Shape("red",false);
         System.out.println(shape);

         // Circle:
         Circle circle = new Circle();
         System.out.println(circle);

         circle = new Circle(3.5);
         System.out.println(circle);

         circle = new Circle(3.5, "indigo", false);
         System.out.println(circle);
         // Rectangle:

         Rectangle rectangle = new Rectangle();
         System.out.println(rectangle);

         rectangle = new Rectangle(2.3, 5.8);
         System.out.println(rectangle);

         rectangle = new Rectangle(2.5, 3.8, "orange", true);
         System.out.println(rectangle);

         /* Square: */
         Square square = new Square();
         System.out.println(square);

         square = new Square(2.3);
         System.out.println(square);

         square = new Square(5.8, "yellow", true);
         System.out.println(square);
    }
}
