package _15_XuLyNgoaiLe.bai_Tap._1_Using_Class_IllegalTriangleException;

public class IllegalTriangleException extends Exception {
      double size = 1.0;

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public IllegalTriangleException(double size){
           super(size+"Error : size > size + size ");

    }
    public IllegalTriangleException(double size1, double size2, double size3){
            super("Error : Giá trị nhập vào lớn hơn 0");

    }
}
