package _00_SOLID._04_interface_segregation.ex02;

public class Robot implements Workable{

    @Override
    public void work() {
        System.out.println("Robot is working");
    }
}
