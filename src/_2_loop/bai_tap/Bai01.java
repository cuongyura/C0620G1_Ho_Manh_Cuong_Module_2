package _2_loop.bai_tap;

import java.util.Scanner;

public class Bai01 {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int luaChon;
          do {
              System.out.print("\t\t\t\t---------menu----------" +
                      "\n\t\t\t\t1.Vẽ hình chữ nhật." +
                      "\n\t\t\t\t2.Vẽ hình tam giác." +
                      "\n\t\t\t\t3.Vẽ hình tam giác ngưọc." +
                      "\n\t\t\t\t4.Vẽ hình tam giác cân." +
                      "\n\t\t\t\t5.Exit"
              );
              System.out.println("\nMời bạn nhập sự lựa chọn: ");
              luaChon = sc.nextInt();
              switch (luaChon) {
                  case 1:
                      veHinhChuNhat();
                      break;
                  case 2:
                     veHinhTamGiac();
                      break;
                  case 3:
                      veHinhTamGiacVuongNguoc();
                      break;
                  case 4:
                      veHinhTamGiacCan();
                      break;
                  default:
                      System.out.println("Kết thúc chương trình!");
                      System.exit(0);
                      break;
              }
          } while (luaChon > 0);


      }
      // hàm vẽ hình chữ nhật :

          public static void veHinhChuNhat(){
          System.out.println("1.In hình chữ nhật"+"\n\n");
          for (int i = 0 ; i < 3; i++){
              for (int j = 0 ; j < 7; j++){
                  System.out.print("*");
              }
              System.out.println();
          }
      }
      // hàm vẽ hình tam giác:

          public static void veHinhTamGiac(){
              System.out.println("2.In hình tam giác vuông"+"\n\n");
              for (int i = 0; i < 6; i++) {
                  for (int j = 0; j < i; j++) {
                      System.out.print("*");
                  }
                  System.out.println();
              }
          }

      // hàm in hình tam giác vuông ngược:

          public static void veHinhTamGiacVuongNguoc(){
              System.out.println("3. In hình tam giác vuông"+"\n\n");
              for (int i = 0; i < 5; i++) {
                  for (int j = 5; j > i; j--) {
                      System.out.print("*");
                  }
                  System.out.println();
              }
          }
      // Vẽ hình Tam giác cân:

          public static void veHinhTamGiacCan(){
              System.out.println("5. In hình tam giác cân"+"\n\n");
              int i, j;
              for ( i = 0 ; i < 5; i++){
                  for ( j = 0 ; j < 9 ; j++){
                      if(i == 0 &&(j==4)
                              || i == 1 && (j>2 && j<6)
                              || i == 2 && (j>1 && j<7)
                              || i == 3 && (j>0 && j<8)
                              || i == 4 &&( j>=0 && j<=9)
                      ){
                          System.out.print("*");
                      }else {
                          System.out.print(" ");
                      }
                  }
                  System.out.println();
              }

          }
}
