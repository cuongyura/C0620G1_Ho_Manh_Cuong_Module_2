package _1_introduction_java.thuc_hanh;

import java.util.Scanner;

public class bai07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Khai báo biến:
        double weight, height , bmi;
        System.out.print("weight = ");
        weight = sc.nextDouble();
        System.out.print("height = ");
        height = sc.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20S%s","bmi","Interpretation\n");
        if(bmi<18){
            System.out.printf("%-20.2f%s",bmi,"Underweight");
        }else if(bmi< 25.0){
            System.out.printf("%-20.2f%s",bmi,"Normal");
        }else if(bmi < 30.0){
            System.out.printf("%-20.2f%s",bmi,"Overweight");
        }else {
            System.out.printf("%-20.2f%s",bmi,"Normal");
        }



    }
}
