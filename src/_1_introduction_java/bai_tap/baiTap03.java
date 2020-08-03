package _1_introduction_java.bai_tap;

import java.util.Scanner;

public class baiTap03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter USA=  ");
        int USA = sc.nextInt();
        int VND = USA * 23000;
        System.out.println("VND = "+VND+" Đồng");

    }
}
