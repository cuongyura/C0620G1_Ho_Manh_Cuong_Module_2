package _1_introduction_java.thuc_hanh;

import java.util.Scanner;

public class Bai03 {
    public static void main(String[] args){
         // Khai báo chiều cao và chiều rộng:
        float widht;
        float height;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Widht = ");
        widht = sc.nextFloat();
        System.out.println("Enter Height = ");
        height = sc.nextFloat();
        // Tính diện tích:
        float area = widht*height;
        System.out.println("Area = "+area);
    }

}
