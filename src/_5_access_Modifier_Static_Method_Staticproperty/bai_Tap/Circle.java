package _5_access_Modifier_Static_Method_Staticproperty.bai_Tap;

public class Circle {
    // Thuộc tính:
       private double darius;
       private String color;
    // Constructor:
       /*Hàm khởi tạo mặc định: */
       public Circle(){
           this(1.0,"red");
       }
        /*Hàm khởi tạo có đối số: */
        public Circle(double darius, String color){
           this.darius = darius;
           this.color = color;
        }

        public double getDarius() {
            return darius;
        }

        public String getColor() {
            return color;
        }
}
    class TestCircle{
        public static void main(String[] args) {
         // Khởi tạo đối tượng:
         Circle circle = new Circle();
         System.out.println(" Circle have: : "
                            +"\n Darius: "+circle.getDarius()
                            +"\n Color: "+circle.getColor());
        }
    }
