package _2_loop.thuc_hanh;

import java.util.Scanner;

public class bai02 {
    public static void main(String[] args){
        // Khai báo biến:
        double money = 1.0;
        int month = 1;
        double interset_rate = 1.0;
        // hàm nhập vào
        Scanner sc = new Scanner(System.in);
        // nhập:
        System.out.println("Nhập tiền gửi: ");
        money = sc.nextDouble();
        System.out.println("Nhập tháng gửi: ");
        month = sc.nextInt();
        System.out.println("Nhập lãi suất: ");
        interset_rate = sc.nextDouble();
        // Tính lãi suất:
        double total_interser = 0;
        for (int i = 0; i < month ; i++){
              total_interser += money * (interset_rate/100)/12 * month ;
        }
        System.out.println("Total Interser: "+total_interser);

    }
}
