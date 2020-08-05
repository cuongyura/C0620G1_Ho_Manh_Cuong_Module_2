package _3_Mang_Va_PhuongThuc.bai_Tap;

import java.util.Scanner;

public class Bai03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr3 = new int[10];
        int []arr1 = {7,1,5,6,8};
        int []arr2 = {6,7,8,1,9};
        System.out.println("Array 1: ");
        for (int i = 0 ; i < arr1.length;i++){
            System.out.print("[ "+arr1[i]+" "+"]");
        }
        System.out.println("\n Arr1.length: "+arr1.length);
        System.out.println("\nArray 2:");
        for (int i = 0 ; i < arr2.length;i++){
            System.out.print("[ "+arr2[i]+" "+"]");
        }
        System.out.println("\n Arr3.length: "+arr2.length);
        System.out.println("\nArray 3:");
        for(int i = 0; i< arr3.length; i++) {
            if (i < 5) {
                arr3[i] = arr1[i];
            } else {
                arr3[i] = arr2[i - 5];
            }
            System.out.print("[ "+arr3[i]+" "+"]");
        }
        System.out.println("\n Arr3.length: "+arr3.length);
        



    }

}
