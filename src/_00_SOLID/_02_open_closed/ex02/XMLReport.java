package _00_SOLID._02_open_closed.ex02;

public class XMLReport implements Report{

    @Override
    public void generate() {
        System.out.println("Generating XML report...");
    }
}
