package _4_Lop_Va_DoiTuong.bai_Tap;

public class Fan {
    // Thuộc tính:
    private final int SLOW= 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double darius;
    private String color;
    // Khởi tạo mặc định:
    public Fan(){
    }
    // Khởi tạo có đối số:
    public Fan(int speed,boolean on,double darius,String color){
        this.speed  = speed;
        this.on     = on;
        this.darius = darius;
        this.color  = color;
    }
    // get set:

    public int getSLOW(){
        return this.SLOW;
    }
    public int getMEDIUM(){
        return this.MEDIUM;
    }
    public int getFAST(){
        return this.FAST;
    }
    public void setSpeed(){
        this.speed = speed;
    }
    public int getSpeed(){
        return this.speed;
    }
    public void setOn(double on){
        this.speed = speed;
    }
    public boolean getOn(){
        return this.on;
    }
    public void setDarius(double darius){
        this.darius = darius;
    }
    public double getDarius(){
        return this.darius;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
    public String toString() {
        if (this.on) {
            return " -> { "
                    + "\nspeed = " + speed
                    + "\nDadius = " + darius
                    + "\nColor = " + color
                    + " }"
                    + "\n fan is on";
        } else {
            return " -> { "
                    + "\nspeed = " + speed
                    + "\nDadius = " + darius
                    + "\nColor = " + color
                    + " }"
                    + "\n fan is off";
        }


    }
    public static void main(String[] args) {
        Fan fan = new Fan(3,true,10,"yellow");
        Fan fan1 = new Fan(2,false,5,"Blue");
        System.out.println("Fan"  +fan.toString());
        System.out.println("Fan 1"+fan1.toString());
    }
}
