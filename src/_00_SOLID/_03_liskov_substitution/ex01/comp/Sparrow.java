package _00_SOLID._03_liskov_substitution.ex01.comp;

//Class for a bird that can fly
public class Sparrow extends Bird implements Flyable{

    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}
