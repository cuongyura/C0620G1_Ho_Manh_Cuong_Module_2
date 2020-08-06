package _4_Lop_Va_DoiTuong.thuc_hanh;

import java.util.Scanner;

public class Rectangle {
    double width,height;
    public Rectangle(){

    }
    public Rectangle(double width , double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.width * this.height;
    }
    public double getPerimeter(){
        return (this.width + this.height)*2;
    }
    public String dislay(){
        return "Rectangle{"+"width= "+width+", height="+height+"}";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Nhập chiều dài và rộng:
        System.out.println("Enter the width: ");
        double width = sc.nextDouble();
        System.out.println("Enter the height: ");
        double height = sc.nextDouble();
        // Khởi tạo đối tượng:
        Rectangle rectangle = new Rectangle(width,height);
        // gọi phương thức:
        System.out.println("Your Rectangle \\n\"+ rectangle.display()");
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
    }


}
