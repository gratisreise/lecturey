package _03_template_method.ex01;

public class Tea extends Beverage{

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");

    }
}
