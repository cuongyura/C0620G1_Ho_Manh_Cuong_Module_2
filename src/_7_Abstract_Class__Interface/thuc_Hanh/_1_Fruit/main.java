package _7_Abstract_Class__Interface.thuc_Hanh._1_Fruit;

public class main {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[2];
         fruits[0] = new Orange();
         fruits[1] = new Apple();
           for (Fruit fruit : fruits){
               System.out.println(fruit.howToEat());
            }
        }
    }

