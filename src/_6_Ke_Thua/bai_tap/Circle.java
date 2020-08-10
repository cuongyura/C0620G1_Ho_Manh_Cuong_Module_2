package _6_Ke_Thua.bai_tap;

import javax.sound.midi.Soundbank;

public class Circle {
     // Thuộc tính:

       private double radius;
       private String color;

     // Phương thức khởi tạo:
       public Circle(){

       }
       public Circle(double radius, String color){
            this.radius = radius;
            this.color = color;
       }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
           return 2*Math.PI*radius*radius;
    }

    public String toString(){
           return   "\n Màu sắc: "+getColor()
                   +"\n bán kính: "+getRadius();
    }

}
class Cylinder extends Circle{
       // Thuộc tính
        private double height;
       // Hàm khởi tạo:
       public Cylinder(){

       }
       public Cylinder(double height){
        this.height = height;
       }
       public Cylinder(double height,double radius, String color){
           super(radius,color);
           this.height = height;
       }

       public void setHeight(double height) {
           this.height = height;
       }

       public double getHeight() {
           return height;
       }
       // Diện tích xung quanh hình trụ:
       public double getAreaAround(){
           return 2*Math.PI*getRadius()*height;
       }
       // Diện tích toàn phần hình trụ:
       public double getAreaTotality(){
           double exp1 = (2*Math.PI*getRadius()*getRadius());
           double exp2 = (2*Math.PI*getRadius()*height);
           return exp1+exp2;
       }
       public String toString(){
            return
                    "\nChiều cao: "+getHeight()
                     + super.toString();

       }


}

class testMain{
    public static void main(String[] args) {
        // Khởi tạo đối tượng:
        Circle circle = new Circle(4.0,"Yellow");
        System.out.println(" -> Circle: "
                                    +"\n"+circle.toString()+
                                      "\n Diện tích : "+circle.getArea());
        Cylinder cylinder = new Cylinder(9.0,4.0,"Red");
        System.out.println("\n\n -> Cylinder : "
                                        +"\n"+cylinder.toString()
                                        +"\n Diện tích xung quang: "+cylinder.getAreaAround()
                                        +"\n Diện tích toàn phần: "+cylinder.getAreaTotality());

    }

}
