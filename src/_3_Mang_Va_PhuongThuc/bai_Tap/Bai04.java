package _3_Mang_Va_PhuongThuc.bai_Tap;

import java.util.Scanner;

public class Bai04 {
    public static void main(String[] args) {
        int soDong, soCot;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào số dòng của mảng: ");
        soDong = sc.nextInt();
        System.out.println("Nhập vào số cột của mảng: ");
        soCot = sc.nextInt();
        // khai báo và cấp phát bộ nhớ cho mảng
        int[][] A = new int[soDong][soCot];
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                A[i][j] = sc.nextInt();
            }
        }
        int min = A[0][0];
        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(A[i][j] + "\t");
                if(A[i][j] < min){
                    min = A[i][j];
                }
            }
            System.out.println("\n");
        }
        System.out.println(" Min là : "+min);
          }
    }

