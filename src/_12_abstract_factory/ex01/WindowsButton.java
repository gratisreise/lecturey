package _12_abstract_factory.ex01;

class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a button in Windows style");
    }
}