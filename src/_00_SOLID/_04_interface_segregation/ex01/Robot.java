package _00_SOLID._04_interface_segregation.ex01;

public class Robot implements Worker
{

    @Override
    public void work() {
        System.out.println("Robot is working");
    }

    @Override
    public void eat() {
        // Robots do not eat
        throw new UnsupportedOperationException("Robots do not eat");
    }
}
