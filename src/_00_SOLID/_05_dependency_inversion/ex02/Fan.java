package _00_SOLID._05_dependency_inversion.ex02;

public class Fan implements Switchable
{
    @Override
    public void turnOn() {
        System.out.println("Fan is spinning");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is stopping");
    }
}
