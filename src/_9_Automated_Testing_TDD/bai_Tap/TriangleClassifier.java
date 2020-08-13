package _9_Automated_Testing_TDD.bai_Tap;

import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = sc.nextDouble();
        System.out.println("Nhập b: ");
        double b = sc.nextDouble();
        System.out.println("Nhập c: ");
        double c = sc.nextDouble();
        if((a + b) > c && (a + c) > b && (b + c > a) && ( a > 0) && b > 0 && c > 0){
            System.out.println("{ "+a+", "+b+", "+c+" }"+"\n -> Là ba cạnh của tam giác!");
            if((a==b) && (b==c) && (c==a)){
                System.out.println(" -> Đây là tam giác đều!");

            }else if((a==b) || (b==c) || (a == c)){
                System.out.println(" -> Đây là tam giác cân!");

            }else if((a*a == b*b+c*c) || (b*b == a*a + c*c) || (c*c == a * a + b*b) ){
                System.out.println(" -> Đây là tam giác vuông!");

            }else {
                System.out.println(" -> Đây là tam giác thường!");

            }
        }else {
            System.out.println("{ "+a+", "+b+", "+c+" }"+"\n -> không hợp lệ!");
        }
    }

}
