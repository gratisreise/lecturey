package _00_SOLID._03_liskov_substitution.ex02;

//Class for a bird that can fly
public class Sparrow extends Bird implements Flyable{

    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}
