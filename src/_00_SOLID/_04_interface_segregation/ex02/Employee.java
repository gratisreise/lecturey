package _00_SOLID._04_interface_segregation.ex02;

public class Employee implements Workable, Eatable{

    @Override
    public void eat() {
        System.out.println("Employee is eating");
    }

    @Override
    public void work() {
        System.out.println("Employee is working");
    }
}
