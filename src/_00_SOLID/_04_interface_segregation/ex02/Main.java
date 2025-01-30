package _00_SOLID._04_interface_segregation.ex02;

public class Main {

    public static void main(String[] args) {
        Workable employee = new Employee();
        employee.work(); // Employee is working
        ((Eatable) employee).eat(); // Employee is eating

        Workable robot = new Robot();
        robot.work(); // Robot is working
        //((Eatable) robot).eat(); // Compilation error, Robot does not imp
    }
}
