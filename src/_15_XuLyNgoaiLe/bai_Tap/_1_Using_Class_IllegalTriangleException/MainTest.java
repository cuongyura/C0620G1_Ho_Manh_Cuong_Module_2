package _15_XuLyNgoaiLe.bai_Tap._1_Using_Class_IllegalTriangleException;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double size1;
        double size2;
        double size3;
        boolean checkTriangle = false;
        Triangle triangle;

        while (!checkTriangle){
            try {
                System.out.println("Enter size1: ");
                size1 = sc.nextInt();
                System.out.println("Enter size2: ");
                size2 = sc.nextInt();
                System.out.println("Enter size3: ");
                size3 = sc.nextInt();
                triangle = new Triangle(size1, size2, size3);
                checkTriangle = true;
            }catch (IllegalTriangleException e){
                System.out.println(e.getMessage());

            }
        }
    }
}
