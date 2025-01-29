package _00_SOLID._03_liskov_substitution.ex02.comp;

public class AreaCalculator {
    public void calculateArea(Shape shape){
        System.out.println("Area: " + shape.getArea());
    }

}
