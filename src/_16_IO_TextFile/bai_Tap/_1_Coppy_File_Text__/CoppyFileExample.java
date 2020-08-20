package _16_IO_TextFile.bai_Tap._1_Coppy_File_Text__;

import java.io.*;

public class CoppyFileExample {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {

            File file1 =new File("E:\\C0620G1_Ho_Manh_Cuong\\module2\\src\\_16_IO_TextFile\\bai_Tap\\_1_Coppy_File_Text__\\file1.txt");
            File file2 =new File("E:\\C0620G1_Ho_Manh_Cuong\\module2\\src\\_16_IO_TextFile\\bai_Tap\\_1_Coppy_File_Text__\\file2.txt");
            inputStream  = new FileInputStream(file1);
            outputStream = new FileOutputStream(file2);

            int length;
            byte[] buffer = new byte[1024];

            // coppy the file content in bytes:

            while((length = inputStream.read(buffer)) > 0){
                   outputStream.write(buffer, 0, length);
            }
            System.out.println("File is copied succcessful!");

        } catch (IOException e){
            e.printStackTrace();
        } finally {
             inputStream.close();
             outputStream.close();
        }

    }
}
