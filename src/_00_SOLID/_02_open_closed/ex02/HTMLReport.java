package _00_SOLID._02_open_closed.ex02;

public class HTMLReport implements Report{

    @Override
    public void generate() {
        System.out.println("Generating HTML report ...");
    }
}
