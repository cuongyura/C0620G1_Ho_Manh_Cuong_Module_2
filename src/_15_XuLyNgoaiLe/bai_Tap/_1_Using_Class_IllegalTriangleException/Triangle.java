package _15_XuLyNgoaiLe.bai_Tap._1_Using_Class_IllegalTriangleException;


public class Triangle {

   // thuộc tính:

    private double size1;
    private double size2;
    private double size3;

    public Triangle(){

    }

    public Triangle(double size1, double size2, double size3) throws IllegalTriangleException{

        if(size1 < 0 || size2 < 0 || size3 < 0){
            throw new IllegalTriangleException(size1, size2, size3);
        }
        if(size1 >= size2 + size3){
               throw new IllegalTriangleException(size1);
           }else if(size2 >= size1+size3){
               throw new IllegalTriangleException(size2);
           }else if(size3 >= size1+size2){

               throw new IllegalTriangleException(size2);

           }else {
                this.size1 = size1;
                this.size2 = size2;
                this.size3 = size3;
           }




    }

    public double getSize1() {
        return size1;
    }

    public double getSize2() {
        return size2;
    }

    public double getSize3() {
        return size3;
    }

    public void setSize1(double size1) {
        this.size1 = size1;
    }

    public void setSize2(double size2) {
        this.size2 = size2;
    }

    public void setSize3(double size3) {
        this.size3 = size3;
    }

}


