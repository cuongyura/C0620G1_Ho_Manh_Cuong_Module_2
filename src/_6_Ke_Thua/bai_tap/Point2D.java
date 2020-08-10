package _6_Ke_Thua.bai_tap;

public class Point2D {
    private float x;
    private float y;
    // Hàm khởi tạo:
    public Point2D(){

    }
    public Point2D(float x, float y){
       this.x = x;
       this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){

        return new float[]{this.x,this.y};
    }

    @Override
    public String toString() {
        return
                "x=" + x +
                ", y=" + y;
    }
}
class Point3D extends Point2D{
    // thuộc tính:
    private float z = 0.0f;
    // hàm khởi tạo:
    public Point3D(){

    }
    public Point3D(float z){
       this.z = z;
    }
    public Point3D(float z, float x, float y){
      super(x,y);
      this.z = z;
    }
    public void setZ(float z) {
        this.z = z;
    }

    public float getZ() {
        return z;
    }
    void setXYZ(float x, float y, float z){

        this.z = z;
    }
    public float[] getXYZ(){

        return new float[]{this.getX(),this.getY(),this.z};
    }

    @Override
    public String toString() {
        return
                super.toString()
                +" , z=" + z;
    }
}
class test{
    public static void main(String[] args) {
        Point2D point2D = new Point2D(7,6);
        System.out.println("Point2D: ");
        System.out.println(point2D);
        System.out.println("Point3D: ");
        Point2D point3D = new Point3D(9,1,8);
        System.out.println(point3D);
    }
}
