package _3_Mang_Va_PhuongThuc.bai_Tap;

import java.util.Arrays;
import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] array = {4,100,65,65,20,99,120};
        int dem = 0;
        // in mảng:
            System.out.println("Mảng Array : ");
            for (int j = 0 ;j < array.length; j++){
                System.out.print(array[j]+" ");
            }
            System.out.println("\nNhập giá trị x: ");
            int giaTrix = sc.nextInt();
            for (int i = 0; i < array.length; i++){
                if(giaTrix == array[i]){
                    int index = i;
                    System.out.println("Vị trí của: "+giaTrix+" là: "+index);
                    dem++;
                }
            }
          int[] arrayNew = new int[array.length - dem];
          int j = 0;
          for(int i = 0;i<array.length;i++){
            if(array[i] == giaTrix){
                continue;
            }
            arrayNew[j] = array[i];
            j++;
        }
        System.out.println("Mang moi: "+ Arrays.toString(arrayNew));




    }
}
