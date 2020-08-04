package _3_Mang_Va_PhuongThuc.bai_Tap;

import java.util.Scanner;

public class Bai02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] array = {4,25,112,220,14,48,66,3,0};
        for (int i = 0; i < array.length;i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println("\nNhập vào giá trị X: ");
        int giaTriX = sc.nextInt();
        System.out.println("\nNhập vào vị trí cần chèn: ");
        int index = sc.nextInt();
        for (int i = 0; i < array.length;i++){
            if(index <= 1 && index >= array.length-1){
                System.out.println("Không chèn được vào mảng");

            }else{
                  array[index] = giaTriX;
                  System.out.print(array[i]+" ");
            }
        }

    }
}
