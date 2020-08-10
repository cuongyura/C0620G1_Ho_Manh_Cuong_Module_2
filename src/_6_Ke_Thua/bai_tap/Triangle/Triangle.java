package _6_Ke_Thua.bai_tap.Triangle;

import java.util.Scanner;

public class Triangle {
    Scanner sc = new Scanner(System.in);
    // Thuộc tính:

      private double side1 = 1.0;
      private double side2 = 1.0;
      private double side3 = 1.0;

    // Hàm khởi tạo:
    public Triangle(){

    }
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public void enterTriangle(){
        System.out.println(" Enter A: ");
    }




}
