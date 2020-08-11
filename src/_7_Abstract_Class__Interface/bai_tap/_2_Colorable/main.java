package _7_Abstract_Class__Interface.bai_tap._2_Colorable;


public class main {
    public static void main(String[] args) {
        Shape[] array = new Shape[1];
        array[0] = new Square(10);
        for (Shape shape : array){{
            if(shape instanceof Square)((Square) shape).howToColor();
        }
        }
    }
}
