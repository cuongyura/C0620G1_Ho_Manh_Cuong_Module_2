package _4_Lop_Va_DoiTuong.bai_Tap;

import java.util.Scanner;

public class QuadraticEquation {
    double a;
    double b;
    double c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getA(double a) {
        return this.a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getB(double b) {
        return this.b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getC(double c) {
        return this.c;
    }

    public double getDiscriminant() {
        return b*b - 4*a*c;
    }
    public double getRoot1() {
        return (-b + Math.sqrt(b*b-4*a*c))/(2*a);
    }
    public double getRoot2() {
        return (-b - Math.sqrt(b*b-4*a*c))/(2*a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Khởi tạo đối tượng:
        double a;
        do {
            System.out.println("Enter a: ");
            a = sc.nextDouble();
        }while (a == 0);
        System.out.println("Enter b: ");
        double b = sc.nextDouble();
        System.out.println("Enter c: ");
        double c = sc.nextDouble();
        QuadraticEquation  quadraticEquation = new QuadraticEquation(a,b,c);


        // Tính toán:
        double detal = quadraticEquation.getDiscriminant();
        double x1 = quadraticEquation.getRoot1();
        double x2 = quadraticEquation.getRoot2();
        if(detal > 0){
            System.out.println("Phương trình có 2 nghiệm"
                    +"\nX1= "+x1
                    +"\nX2= "+x2);
        }else{
            if (detal < 0){
                System.out.println("Phương trình vô nghiệm! ");
            }else if(detal == 0){
                x1 = -b/(2*a);

                System.out.println("Phương trình có nghiệm kép: "+x1);
            }
        }
    }

}


