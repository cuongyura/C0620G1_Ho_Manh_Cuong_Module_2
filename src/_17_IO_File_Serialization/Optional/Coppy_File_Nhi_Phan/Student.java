package _17_IO_File_Serialization.Optional.Coppy_File_Nhi_Phan;

import java.io.Serializable;

public class Student implements Serializable {
     private String maSo;
     private String hoTen;
     private int age;
     private String diaChi;

    public Student() {
    }

    public Student(String maSo, String hoTen, int age, String diaChi) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.age = age;
        this.diaChi = diaChi;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

}
