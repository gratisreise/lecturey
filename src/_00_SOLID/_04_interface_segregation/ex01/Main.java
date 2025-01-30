package _00_SOLID._04_interface_segregation.ex01;

public class Main {

    public static void main(String[] args) {
        Worker employee = new Employee();
        employee.work();// Employee is working
        employee.eat();// Employee is eating

        Worker robot = new Robot();
        robot.work(); // Robot is working
        robot.eat(); // Throws UnsupportedOperationException
    }
}
