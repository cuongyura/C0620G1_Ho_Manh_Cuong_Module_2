package _5_access_Modifier_Static_Method_Staticproperty.thuc_Hanh;

public class Car {
    // Phương Thức:
     private String name;
     private String engine;

     public static int numberOfCars;
     public Car(){
         this("Mazda 3","Skyactiv 3");
     }
     public Car(String name, String engine){
     this.name = name;
     this.engine = engine;
     numberOfCars++;
     }
}
  class TestStaticProperty{
      public static void main(String[] args) {
          Car car1 = new Car();
          System.out.println(car1.numberOfCars);
          Car car2 = new Car();
          System.out.println(car2.numberOfCars);
      }
        }
