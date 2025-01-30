package _00_SOLID._04_interface_segregation.ex01;

public class Employee implements Worker{

    @Override
    public void work() {
        System.out.println("Employee is working");
    }

    @Override
    public void eat() {
        System.out.println("Employee is eating");
    }
}
