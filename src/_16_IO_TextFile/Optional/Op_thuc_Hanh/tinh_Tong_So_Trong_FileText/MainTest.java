package _16_IO_TextFile.Optional.Op_thuc_Hanh.tinh_Tong_So_Trong_FileText;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readfileEx = new ReadFileExample();
        readfileEx.readFileText(path);
    }
}
