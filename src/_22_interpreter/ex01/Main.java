package _22_interpreter.ex01;

public class Main {

    public static void main(String[] args) {
        Expression five = new Number(5);
        Expression two = new Number(2);
        Expression three = new Number(3);

        Expression addExpression = new Add(five, two);

        Expression subtractExpression
            = new Subtract(addExpression, three);

        System.out.println(
            "(5 + 2) - 3 = "
                + subtractExpression.interpret());

    }

}
