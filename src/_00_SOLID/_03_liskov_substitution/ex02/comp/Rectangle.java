package _00_SOLID._03_liskov_substitution.ex02.comp;

public class Rectangle implements Shape{
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }


    @Override
    public int getArea() {
        return width * height;
    }
}
