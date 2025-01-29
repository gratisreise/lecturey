package _00_SOLID._03_liskov_substitution.ex02.comp;

public class Main {

    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        // LSP Violation
//        Rectangle rectangle = new Rectangle();
//        calculator.calculateArea(rectangle); // Output: Area: 20
//
//        Square square = new Square();
//        calculator.calculateArea(square); // Output: Area: 16 (Unexpected)

        // LSP Compliant
        Shape rectangle = new Rectangle(5, 4);
        calculator.calculateArea(rectangle); // Output: Area: 20

        Shape square = new Square(5);
        calculator.calculateArea(square); // Output: Area: 25 (Expected)
    }
}
