package _16_IO_TextFile.Optional.Op_bai_Tap._Doc_File_CSV;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingCVS {
    public static void main(String[] args) throws IOException {
        String file1 = "E:\\C0620G1_Ho_Manh_Cuong\\module2\\src\\_16_IO_TextFile\\Optional\\Op_bai_Tap\\_Doc_File_CSV\\cvs.txt";
        File file = new File(file1);
        // kiêm tra sự tồn tại:

        if(!file.exists()){
           file.createNewFile();
        }

        // Đọc dữ liệu từ file:

        FileInputStream fileInputStream = new FileInputStream(file);

        // đọc file theo tuần tự:
        int c = fileInputStream.read();

        while (c != -1){
            System.out.print((char)c);
            c = fileInputStream.read();

        }
        fileInputStream.close();
    }
}
