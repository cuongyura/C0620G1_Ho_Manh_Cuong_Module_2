package _17_IO_File_Serialization.Optional.Coppy_File_Nhi_Phan;

import java.io.*;

public class BinaryFile {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*Student student = new Student();
        student.setMaSo("375114G");
        student.setHoTen("Ra Phát Cỏ");
        student.setAge(17);
        student.getDiaChi("Đà Nẵng");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("student1.dat")));
        oos.writeObject(student);*/

        ObjectInputStream ios = new ObjectInputStream(new FileInputStream("student1.dat"));
        Student student = (Student) ios.readObject();

        System.out.println(student.getMaSo());
        System.out.println(student.getHoTen());
        System.out.println(student.getAge());
        System.out.println(student.getDiaChi());
    }
}
