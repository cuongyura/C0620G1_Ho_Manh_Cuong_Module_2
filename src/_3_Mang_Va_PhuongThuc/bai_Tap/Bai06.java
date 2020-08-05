package _3_Mang_Va_PhuongThuc.bai_Tap;

import java.util.Scanner;

public class Bai06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Khai báo dòng và cột: */
        System.out.println("Nhập vào số dòng: ");
        int soDong = sc.nextInt();
        System.out.println("Nhập vào số cột: ");
        int soCot = sc.nextInt();
        /*Khởi tạo mảng: */
        int[][] array = new int[soDong][soCot];
        // nhập mảng:
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.println("Nhập phần tử thứ [" + i + "]" + "[" + j + "]");
                array[i][j] = sc.nextInt();
            }
        }
        // In mảng:
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(array[i][j]+" \t");
            }
            System.out.println();
        }
        int sum = 0;
        System.out.println("\n Nhập vào số cột muốn tính: ");
        int socotTinh = sc.nextInt();
        for (int i = 0; i < soDong; i++){
                  sum += array[i][socotTinh];
               }
            System.out.println("Tổng là : "+sum);
        }
    }


