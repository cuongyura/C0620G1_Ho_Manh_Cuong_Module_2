package _7_Abstract_Class__Interface.bai_tap._1_Resizeable;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        /*Khởi tạo đối tượng :*/
        Shape[] array = new Shape[3];
        array[0] = new Circle(7.0);
        array[1] = new Rectangle(7.0,3.8);
        array[2] = new Square(7.0);
       for (Shape shape : array){
           System.out.println(shape);
           double percent = Math.random();
           shape.resize(percent);
           if(shape instanceof Square){
               System.out.println(shape);
           }
       }

        }
    }
