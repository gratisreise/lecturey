package _00_SOLID._03_liskov_substitution.ex02.ncomp;

public class Rectangle {

    protected int width;
    protected int height;
    public void setWidth(int width){
        this.width = width;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public int getArea(){
        return width * height;
    }
}
