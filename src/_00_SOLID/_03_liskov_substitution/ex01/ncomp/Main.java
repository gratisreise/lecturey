package _00_SOLID._03_liskov_substitution.ex01.ncomp;

public class Main {

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly(); // Bird is flying

        Bird penguin = new Penguin();
        penguin.fly(); // 예외 던짐
    }

}
