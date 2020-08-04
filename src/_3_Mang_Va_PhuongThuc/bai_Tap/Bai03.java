package _3_Mang_Va_PhuongThuc.bai_Tap;

import java.util.Scanner;

public class Bai03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        int[] arr3 = new int[10];
        /* nhập mảng arr1: */
        for (int i = 0; i < arr1.length; i++){
            System.out.println("Nhập phần tử thứ: "+i+" :");
            arr1[i] = sc.nextInt();
        }
        /* nhập mảng arr2: */
        for (int i = 0; i < arr2.length; i++){
            System.out.println("Nhập phần tử thứ: "+i+" :");
            arr2[i] = sc.nextInt();
        }



    }

}
