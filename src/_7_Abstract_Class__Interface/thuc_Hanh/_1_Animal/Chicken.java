package _7_Abstract_Class__Interface.thuc_Hanh._1_Animal;

public class Chicken extends Animal implements Edible {
    @java.lang.Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be friend";
    }
}
