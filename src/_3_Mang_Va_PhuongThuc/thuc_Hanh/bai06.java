package _3_Mang_Va_PhuongThuc.thuc_Hanh;

import java.util.Scanner;

public class bai06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập size: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        do {
            System.out.print("Enter a size: ");
            size = sc.nextInt();
            if(size > 30){
                System.out.println("Size should not exceed 30");
            }
        }while (size > 30);
        // nhập phần tử của mảng:
            for(int i = 0; i < array.length;i++){
                System.out.println("Nhập phần tử thứ : "+i+" :");
                array[i] = sc.nextInt();
            }
        int count = 0;
        System.out.print("List of mark: ");
        for (int j = 0; j < array.length; j++){
            System.out.print(array[j]+ "\t");
             if(array[j] >= 5 && array[j] <=10){
                 count++;
             }
        }
        System.out.println("\n The number of students passing the exam is " + count);
    }
}
