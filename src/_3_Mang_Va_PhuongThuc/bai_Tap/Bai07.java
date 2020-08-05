package _3_Mang_Va_PhuongThuc.bai_Tap;

import java.util.Scanner;

public class Bai07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int soDong = 3;
        int soCot = 3;
        int[][] array = new int[soDong][soCot];
        // nhập mảng:
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.println("Nhập phần tử thứ [" + i + "]" + "[" + j + "]");
                array[i][j] = sc.nextInt();
            }
        }
        // in mảng:
        for (int i = 0; i < soDong; i++){
            for (int j = 0; j < soCot; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        int sum = 0;
        int count = 0;
        for(int i = 0; i < soCot; i++){
            sum += array[i][count];
            count++;
        }
        System.out.println(" Tổng đường chéo là: "+sum);

    }
}
