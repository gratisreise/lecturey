package _00_SOLID._03_liskov_substitution.ex02.ncomp;

public class AreaCalculator {
    public void calculateArea(Rectangle rectangle){
        rectangle.setWidth(5);
        rectangle.setHeight(4);
        System.out.println("Area: " + rectangle.getArea());
        // Expected output for Rectangle: Area: 20
        // Actual output for Square: Area: 16 (LSP violation)
    }

}
