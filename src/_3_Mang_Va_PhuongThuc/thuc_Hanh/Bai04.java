package _3_Mang_Va_PhuongThuc.thuc_Hanh;

import java.util.Scanner;

public class Bai04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhiệt độ F: ");
        double nhietDoF = sc.nextDouble();
        System.out.println(" Nhiệt độ C: ");
        double nhietDoC = sc.nextDouble();

       int choice;
        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice){
                case 1 :
                    System.out.println("Nhiệt độ C: "+ doFSangDoC(nhietDoF));
                break;
                case 2 :
                    System.out.println("Nhiệt độ F: "+ doCSangDoF(nhietDoC));
                break;
                case 0:
                System.exit(0);
            }

        }while (choice != 0);

    }
    // C -> F:

       public static double doCSangDoF(double nhietDoC){
          double nhietDoF = (9.0 / 5) * nhietDoC + 32;
          return nhietDoF;
       }
    // F -> C:

        public static double doFSangDoC(double nhietdoF){
           double nhietDoC = (5.0 / 9) * (nhietdoF - 32);
           return nhietDoC;
        }


}
