package _6_Ke_Thua.bai_tap;

public class Point {
    // Thuộc tính:
    private float x = 0.0f;
    private float y = 0.0f;

    // Hàm khởi tạo:
    public Point() {

    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    // geter, seter:


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

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {

        return new float[]{this.x, this.y};
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
class MoveablePoint extends  Point{
    // Thuộc tính:
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    //Hàm khởi tạo:
    public MoveablePoint(){

    }
    public MoveablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;

    }
    public MoveablePoint(float x, float y, float xSpeed, float ySpeed){
         super(x,y);
         this.xSpeed = xSpeed;
         this.ySpeed = ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }
    public void setSpeed(){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed() {

        return new float[]{this.xSpeed, this.ySpeed};
    }
    public MoveablePoint move() {
        float x = getX();
        float y = getY();
        setX(x += xSpeed);
        setY(y += ySpeed);
        return this;
    }

    @Override
    public String toString() {
        return   super.toString()
                 +", xSpeed=" + xSpeed
                 +", ySpeed=" + ySpeed;
    }
}
class testPoint{
    public static void main(String[] args) {
      MoveablePoint moveablePoint = new MoveablePoint(7,6);
        System.out.print(moveablePoint.toString()
                         +"\n"+moveablePoint.move()
                           );
    }
}